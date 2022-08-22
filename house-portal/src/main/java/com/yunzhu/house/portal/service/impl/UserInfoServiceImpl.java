package com.yunzhu.house.portal.service.impl;

import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.portal.service.UserInfoService;
import com.yunzhu.house.portal.vo.LoginVo;
import com.yunzhu.house.portal.vo.UserAuthVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 14:05
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public Map<String, Object> loginUser(LoginVo loginVo) {
        return null;
    }

    @Override
    public void userAuth(Long userId, UserAuthVo userAuthVo) {

    }

    @Override
    public SysUser getById(Long userId) {
        return null;
    }

    @Override
    public SysUser selectWxInfoOpenId(String openid) {
        return null;
    }

    @Override
    public void save(SysUser userInfo) {

    }
}
