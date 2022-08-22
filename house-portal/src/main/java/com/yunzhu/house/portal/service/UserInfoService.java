package com.yunzhu.house.portal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.portal.vo.LoginVo;
import com.yunzhu.house.portal.vo.UserAuthVo;

import java.util.Map;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 14:05
 */
public interface UserInfoService extends IService<SysUser> {
    Map<String, Object> loginUser(LoginVo loginVo);

    void userAuth(Long userId, UserAuthVo userAuthVo);

    SysUser selectWxInfoOpenId(String openid);
}
