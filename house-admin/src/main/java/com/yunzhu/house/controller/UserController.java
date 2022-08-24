package com.yunzhu.house.controller;

import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.support.Const;
import com.yunzhu.house.model.SysUser;
import com.yunzhu.house.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by shw
 */
@Controller
@RequestMapping("/SysUser/")
public class UserController {


    @Autowired
    private IUserService iUserService;


    /**
     * 用户登录
     *
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SysUser> login(String userName, String password, HttpSession session) {
        CommonResult<SysUser> response = iUserService.login(userName, password);

        return response;
    }

    /**
     * 用户退出
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return CommonResult.success();
    }

    /**
     * 注册
     *
     * @param SysUser
     * @return
     */
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> register(SysUser SysUser) {
        return iUserService.register(SysUser);
    }

    /**
     * @param str
     * @param type
     * @return
     */
    @RequestMapping(value = "check_valid.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> checkValid(String str, String type) {
        return iUserService.checkValid(str, type);
    }


    @RequestMapping(value = "get_SysUser_info.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SysUser> getSysUserInfo(HttpSession session) {
        SysUser SysUser = (SysUser) session.getAttribute(Const.CURRENT_USER);
        if (SysUser != null) {
            return CommonResult.success(SysUser);
        }
        return CommonResult.failed("用户未登录,无法获取当前用户的信息");
    }


    @RequestMapping(value = "forget_get_question.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> forgetGetQuestion(String SysUsername) {
        return iUserService.selectQuestion(SysUsername);
    }


    @RequestMapping(value = "forget_check_answer.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> forgetCheckAnswer(String SysUsername, String question, String answer) {
        return iUserService.checkAnswer(SysUsername, question, answer);
    }


    @RequestMapping(value = "forget_reset_password.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> forgetRestPassword(String SysUsername, String passwordNew, String forgetToken) {
        return iUserService.forgetResetPassword(SysUsername, passwordNew, forgetToken);
    }


    @RequestMapping(value = "reset_password.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<String> resetPassword(HttpSession session, String passwordOld, String passwordNew) {
        SysUser SysUser = (SysUser) session.getAttribute(Const.CURRENT_USER);
        if (SysUser == null) {
            return CommonResult.failed("用户未登录");
        }
        return iUserService.resetPassword(passwordOld, passwordNew, SysUser);
    }


    @RequestMapping(value = "update_information.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SysUser> update_information(HttpSession session, SysUser SysUser) {
        SysUser currentSysUser = (SysUser) session.getAttribute(Const.CURRENT_USER);
        if (currentSysUser == null) {
            return CommonResult.failed("用户未登录");
        }
        SysUser.setId(currentSysUser.getId());
        SysUser.setUserName(currentSysUser.getUserName());
        CommonResult<SysUser> response = iUserService.updateInformation(SysUser);
        if (response.isSuccess()) {
            response.getData().setUserName(currentSysUser.getUserName());
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return response;
    }

    @RequestMapping(value = "get_information.do", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<SysUser> get_information(HttpSession session) {
        SysUser currentSysUser = (SysUser) session.getAttribute(Const.CURRENT_USER);
        if (currentSysUser == null) {
            return CommonResult.failed("未登录,需要强制登录status=10");
        }
        return iUserService.getInformation(currentSysUser.getId());
    }


}
