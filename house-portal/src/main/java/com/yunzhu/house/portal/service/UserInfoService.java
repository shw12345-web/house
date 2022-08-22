package com.yunzhu.house.portal.service;

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
public interface UserInfoService {
    Map<String, Object> loginUser(LoginVo loginVo);

    void userAuth(Long userId, UserAuthVo userAuthVo);

    SysUser getById(Long userId);

    SysUser selectWxInfoOpenId(String openid);

    void save(SysUser userInfo);
}