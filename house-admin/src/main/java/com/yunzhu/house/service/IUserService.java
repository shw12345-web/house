package com.yunzhu.house.service;

import com.yunzhu.house.common.api.CommonResult;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/24 9:21
 */
public interface IUserService {

    CommonResult<SysUser> login(String userName, String password);

    CommonResult<String> register(SysUser SysUser);

    CommonResult<String> checkValid(String str,String type);

    CommonResult selectQuestion(String userName);

    CommonResult<String> checkAnswer(String userName,String question,String answer);

    CommonResult<String> forgetResetPassword(String userName,String passwordNew,String forgetToken);

    CommonResult<String> resetPassword(String passwordOld,String passwordNew,SysUser SysUser);

    CommonResult<SysUser> updateInformation(SysUser SysUser);

    CommonResult<SysUser> getInformation(Long SysUserId);

    CommonResult checkAdminRole(SysUser SysUser);
}
