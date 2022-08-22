package com.yunzhu.house.portal.controller.app;

import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.portal.service.UserInfoService;
import com.yunzhu.house.portal.util.AuthContextHolder;
import com.yunzhu.house.portal.vo.LoginVo;
import com.yunzhu.house.portal.vo.UserAuthVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 用户
 *
 * @author DELL
 * @date 2022/8/6 15:28
 */
@Controller
@Api(tags = "AppUserController", description = "用户管理")
@RequestMapping("/api/user")
public class AppUserController {


    @Autowired
    private UserInfoService userInfoService;

    /**
     * 用户手机号登录接口
     *
     * @param loginVo
     * @return
     */
    @PostMapping("login")
    public CommonResult login(@RequestBody LoginVo loginVo) {
        Map<String, Object> info = userInfoService.loginUser(loginVo);
        return CommonResult.success(info);
    }

    /**
     * 用户认证接口
     *
     * @param userAuthVo
     * @param request
     * @return
     */
    @PostMapping("auth/userAuth")
    public CommonResult userAuth(@RequestBody UserAuthVo userAuthVo, HttpServletRequest request) {
        //传递两个参数，第一个参数用户id，第二个参数认证数据vo对象
        userInfoService.userAuth(AuthContextHolder.getUserId(request), userAuthVo);
        return CommonResult.success(null);
    }

    /**
     * 获取用户id信息接口
     *
     * @param request
     * @return
     */
    @GetMapping("auth/getUserInfo")
    public CommonResult getUserInfo(HttpServletRequest request) {
        Long userId = AuthContextHolder.getUserId(request);
        SysUser userInfo = userInfoService.getById(userId);
        return CommonResult.success(userInfo);
    }

}
