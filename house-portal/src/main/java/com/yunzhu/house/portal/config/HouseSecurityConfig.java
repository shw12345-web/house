package com.yunzhu.house.portal.config;

import com.yunzhu.house.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * mall-security模块相关配置
 * Created by shw on 2022/8/4.
 */
@Configuration
public class HouseSecurityConfig {

    @Autowired
    private UmsMemberService memberService;

//    @Bean
//    public UserDetailsService userDetailsService() {
//        //获取登录用户信息
//        return username -> memberService.loadUserByUsername(username);
//    }
}
