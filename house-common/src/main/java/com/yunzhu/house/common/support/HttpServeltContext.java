package com.yunzhu.house.common.support;

import com.yunzhu.house.common.xxs.WafRequestWrapper;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 快捷获取HttpServletRequest,HttpServletResponse
 *
 */
public class HttpServeltContext {

    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Forwarded-For");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        ip = "0:0:0:0:0:0:0:1".equals(ip) ? "127.0.0.1" : ip;
        if (ip != null) {
            ip = ip.split(",")[0];
        } else {
            ip = "";
        }
        return ip;
    }

    public static String getIp() {
        return getIp(HttpServeltContext.getRequest());
    }

    public static HttpServletResponse getResponse() throws NullPointerException {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    public static HttpServletRequest getRequest() throws NullPointerException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return new WafRequestWrapper(request);
    }

}
