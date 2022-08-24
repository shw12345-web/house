package com.yunzhu.house.service.impl;

import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/24 10:13
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Override
    public CommonResult<SysUser> login(String userName, String password) {
        return null;
    }

    @Override
    public CommonResult<String> register(SysUser SysUser) {
        return null;
    }

    @Override
    public CommonResult<String> checkValid(String str, String type) {
        return null;
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
        return null;
    }

    @Override
    public CommonResult<String> resetPassword(String passwordOld, String passwordNew, SysUser SysUser) {
        return null;
    }

    @Override
    public CommonResult<SysUser> updateInformation(SysUser SysUser) {
        return null;
    }

    @Override
    public CommonResult<SysUser> getInformation(Long SysUserId) {
        return null;
    }

    @Override
    public CommonResult checkAdminRole(SysUser SysUser) {
        return null;
    }
}
