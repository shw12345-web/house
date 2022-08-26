package com.yunzhu.house.common.config;

import com.yunzhu.house.common.config.properties.AliAppletPayProperties;
import com.yunzhu.house.common.config.properties.AliPayProperties;
import com.yunzhu.house.common.config.properties.IcbcProperties;
import com.yunzhu.house.common.config.properties.WxPayJSProperties;
import com.yunzhu.house.common.config.properties.WxPayProperties;
import com.yunzhu.house.common.config.properties.WxPayXCXProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/26 11:21
 */
@Configuration
public class HouseProperties {


    @Bean
    @ConfigurationProperties(prefix = "house.pay.alipay")
    public AliPayProperties aliPayProperties(){
        return new AliPayProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "house.pay.aliappletpay")
    public AliAppletPayProperties aliAppletPayProperties(){
        return new AliAppletPayProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "house.pay.wxpay")
    public WxPayProperties wxPayProperties(){
        return new WxPayProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "house.pay.wxpayjs")
    public WxPayJSProperties wxPayJSProperties(){
        return new WxPayJSProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "house.pay.wxpayxcx")
    public WxPayXCXProperties wxPayXCXProperties(){
        return new WxPayXCXProperties();
    }

    /**
     * 工银付款配置
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "shands.pay.icbpay")
    public IcbcProperties icbcProperties() {
        return new IcbcProperties();
    }
}
