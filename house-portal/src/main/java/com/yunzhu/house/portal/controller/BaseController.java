package com.yunzhu.house.portal.controller;

import com.yunzhu.house.common.support.HttpServeltContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/23 17:23
 */
@Slf4j
public class BaseController {

    @Autowired
    @Lazy(true)
    private Environment env;

    @Autowired
    protected ApplicationContext applicationContext;

    protected HttpServletRequest getRequest() {
        return HttpServeltContext.getRequest();
    }

    protected HttpServletResponse getResponse() {
        return HttpServeltContext.getResponse();
    }

    protected HttpSession getSession() {
        return getRequest().getSession();
    }


}
