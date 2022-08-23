package com.yunzhu.house.portal.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunzhu.house.common.api.ResultCode;
import com.yunzhu.house.common.exception.ApiException;
import com.yunzhu.house.common.service.RedisService;
import com.yunzhu.house.mapper.SysUserMapper;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.portal.domain.AuthStatusEnum;
import com.yunzhu.house.portal.service.UserInfoService;
import com.yunzhu.house.portal.vo.LoginVo;
import com.yunzhu.house.portal.vo.UserAuthVo;
import com.yunzhu.house.util.JwtTokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 14:05
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements UserInfoService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RedisService redisService;
    @Override
    public Map<String, Object> loginUser(LoginVo loginVo) {
        //从loginVo获取输入的手机号，和验证码
        String phone = loginVo.getPhone();
        String code = loginVo.getCode();

        //判断手机号和验证码是否为空
        if(StringUtils.isEmpty(phone) || StringUtils.isEmpty(code)) {
            throw new ApiException(ResultCode.PARAM_ERROR);
        }

        //判断手机验证码和输入的验证码是否一致
        String redisCode = (String) redisService.get(phone);
        if(!code.equals(redisCode)) {
            throw new ApiException(ResultCode.CODE_ERROR);
        }

        //绑定手机号码
        SysUser userInfo = null;
        if(!StringUtils.isEmpty(loginVo.getOpenid())) {
            userInfo = this.selectWxInfoOpenId(loginVo.getOpenid());
            if(null != userInfo) {
                userInfo.setPhone(loginVo.getPhone());
                this.updateById(userInfo);
            } else {
                throw new ApiException(ResultCode.DATA_ERROR);
            }
        }

        //如果userinfo为空，进行正常手机登录
        if(userInfo == null) {
            //判断是否第一次登录：根据手机号查询数据库，如果不存在相同手机号就是第一次登录
            QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
            wrapper.eq("phone",phone);
            userInfo = baseMapper.selectOne(wrapper);
            if(userInfo == null) { //第一次使用这个手机号登录
                //添加信息到数据库
                userInfo = new SysUser();
                userInfo.setUserName("");
                userInfo.setPhone(phone);
                userInfo.setStatus(1);
                baseMapper.insert(userInfo);
            }
        }

        //校验是否被禁用
        if(userInfo.getStatus() == 0) {
            throw new ApiException(ResultCode.LOGIN_DISABLED_ERROR);
        }

        //不是第一次，直接登录
        //返回登录信息
        //返回登录用户名
        //返回token信息
        Map<String, Object> map = new HashMap<>();
        String name = userInfo.getUserName();
        if(StringUtils.isEmpty(name)) {
            name = userInfo.getNickName();
        }
        if(StringUtils.isEmpty(name)) {
            name = userInfo.getPhone();
        }
        map.put("name",name);

        //jwt生成token字符串
        Map claims=new HashMap();
        map.put("userId",userInfo.getId());
        map.put("userName",name);
        String token = jwtTokenUtil.generateToken(claims);
        map.put("token",token);
        return map;
    }

    @Override
    public void userAuth(Long userId, UserAuthVo userAuthVo) {
//根据用户id查询用户信息
        SysUser userInfo = baseMapper.selectById(userId);
        //设置认证信息
        //认证人姓名
        userInfo.setUserName(userAuthVo.getName());
        //其他认证信息
        userInfo.setCertificatesType(userAuthVo.getCertificatesType());
        userInfo.setCertificatesNo(userAuthVo.getCertificatesNo());
        userInfo.setCertificatesUrl(userAuthVo.getCertificatesUrl());
        userInfo.setAuthStatus(AuthStatusEnum.AUTH_RUN.getStatus());
        //进行信息更新
        baseMapper.updateById(userInfo);
    }


    @Override
    public SysUser selectWxInfoOpenId(String openid) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("openid",openid);
        SysUser userInfo = baseMapper.selectOne(queryWrapper);
        return userInfo;
    }

}
