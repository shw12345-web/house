package com.yunzhu.house.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.support.Const;
import com.yunzhu.house.common.util.MD5Util;
import com.yunzhu.house.mapper.SysUserMapper;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/24 10:13
 */
@Service
public class IUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements IUserService {
    @Override
    public CommonResult<SysUser> login(String userName, String password) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("userName");
        Long resultCount = baseMapper.selectCount(queryWrapper);
        if (resultCount == 0) {
            return CommonResult.failed("用户名不存在");
        }
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", userName);
        wrapper.eq("password", md5Password)
        ;
        SysUser user = baseMapper.selectOne(wrapper);
        if (user == null) {
            return CommonResult.failed("密码错误");
        }

        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return CommonResult.success(user, "登录成功");
    }

    @Override
    public CommonResult<String> register(SysUser user) {
        CommonResult validResponse = this.checkValid(user.getUserName(), Const.USERNAME);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        validResponse = this.checkValid(user.getEmail(), Const.EMAIL);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        user.setRole(Const.Role.ROLE_CUSTOMER);
        //MD5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        int resultCount = baseMapper.insert(user);
        if (resultCount == 0) {
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }

    @Override
    public CommonResult<String> checkValid(String str, String type) {
        if (org.apache.commons.lang3.StringUtils.isNotBlank(type)) {
            //开始校验
            if (Const.USERNAME.equals(type)) {
                QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("user_name", str);
                boolean resultCount = baseMapper.exists(queryWrapper);
                if (resultCount) {
                    return CommonResult.failed("用户名已存在");
                }
            }
            if (Const.EMAIL.equals(type)) {
                QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("email", str);
                Boolean resultCount = baseMapper.exists(queryWrapper);
                if (resultCount) {
                    return CommonResult.failed("email已存在");
                }
            }
        } else {
            return CommonResult.failed("参数错误");
        }
        return CommonResult.success("校验成功");
    }

    @Override
    public CommonResult selectQuestion(String userName) {
        return null;
    }

    @Override
    public CommonResult<String> checkAnswer(String userName, String question, String answer) {
        return null;
    }

    @Override
    public CommonResult<String> forgetResetPassword(String userName, String passwordNew, String forgetToken) {
        if(org.apache.commons.lang3.StringUtils.isBlank(forgetToken)){
            return CommonResult.failed("参数错误,token需要传递");
        }
        CommonResult validResponse = this.checkValid(userName,Const.USERNAME);
        if(validResponse.isSuccess()){
            //用户不存在
            return CommonResult.failed("用户不存在");
        }
        String token =""; //new JwtTokenUtil.(TokenCache.TOKEN_PREFIX+userName);
        if(StringUtils.isBlank(token)){
            return CommonResult.failed("token无效或者过期");
        }

        if(org.apache.commons.lang3.StringUtils.equals(forgetToken,token)){
            String md5Password  = MD5Util.MD5EncodeUtf8(passwordNew);
            QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("user_name", userName);
            queryWrapper.eq("password",md5Password);
            Long rowCount = baseMapper.selectCount(queryWrapper);

            if(rowCount > 0){
                return CommonResult.failed("修改密码成功");
            }
        }else{
            return CommonResult.failed("token错误,请重新获取重置密码的token");
        }
        return CommonResult.failed("修改密码失败");
    }

    @Override
    public CommonResult<String> resetPassword(String passwordOld, String passwordNew, SysUser user) {
        //防止横向越权,要校验一下这个用户的旧密码,一定要指定是这个用户.因为我们会查询一个count(1),如果不指定id,那么结果就是true啦count>0;
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", user.getId());
        queryWrapper.eq("password",MD5Util.MD5EncodeUtf8(passwordOld));
        Long resultCount = baseMapper.selectCount(queryWrapper);
        if(resultCount == 0){
            return CommonResult.failed("旧密码错误");
        }

        user.setPassword(MD5Util.MD5EncodeUtf8(passwordNew));
        int updateCount = baseMapper.updateByPrimaryKeySelective(user);
        if(updateCount > 0){
            return CommonResult.success("密码更新成功");
        }
        return CommonResult.failed("密码更新失败");
    }

    @Override
    public CommonResult<SysUser> updateInformation(SysUser user) {
        //username是不能被更新的
        //email也要进行一个校验,校验新的email是不是已经存在,并且存在的email如果相同的话,不能是我们当前的这个用户的.
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", user.getId());
        queryWrapper.eq("password",user.getEmail());
        Long resultCount = baseMapper.selectCount(queryWrapper);
        if(resultCount > 0){
            return CommonResult.failed("email已存在,请更换email再尝试更新");
        }
        SysUser updateUser = new SysUser();
        updateUser.setId(user.getId());
        updateUser.setEmail(user.getEmail());
        updateUser.setPhone(user.getPhone());
//        updateUser.setQuestion(user.getQuestion());
//        updateUser.setAnswer(user.getAnswer());

        int updateCount = baseMapper.updateByPrimaryKeySelective(updateUser);
        if(updateCount > 0){
            return CommonResult.success(updateUser,"更新个人信息成功");
        }
        return CommonResult.failed("更新个人信息失败");
    }

    @Override
    public CommonResult<SysUser> getInformation(Long userId) {
        SysUser user = baseMapper.selectByPrimaryKey(userId);
        if(user == null){
            return CommonResult.failed("找不到当前用户");
        }
        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return CommonResult.success(user);
    }

    @Override
    public CommonResult checkAdminRole(SysUser user) {
        if(user != null && user.getRole().intValue() == Const.Role.ROLE_ADMIN){
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
}
