package com.yunzhu.house.portal.util;

import com.yunzhu.house.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * 获取当前用户信息工具类
 *
 * @author DELL
 * @date 2022/8/22 15:37
 */
public class AuthContextHolder {

    //获取当前用户id
    public static Long getUserId(HttpServletRequest request) {
        //从header获取token
        String token = request.getHeader("token");
        //jwt从token获取userid
        Long userId = new JwtTokenUtil().getUserId(token);
        return userId;
    }

    //获取当前用户名称
    public static String getUserName(HttpServletRequest request) {
        //从header获取token
        String token = request.getHeader("token");
        //jwt从token获取userid
        String userName = new JwtTokenUtil().getUserNameFromToken(token);
        return userName;
    }
}
