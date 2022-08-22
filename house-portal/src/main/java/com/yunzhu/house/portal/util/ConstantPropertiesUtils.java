package com.yunzhu.house.portal.util;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 9:38
 */

@Component
public class ConstantPropertiesUtils implements InitializingBean {

//    accessKeyId: LTAICNmks8S1RMux
//    accessKeySecret: C07WZ98KO6AdkbNnj2k85Jq6BGmAcr
//    signName: 阿里云短信测试
//    templateCode: SMS_154950909
//    region: cn-hangzhou
//    endpoint: dysmsapi.aliyuncs.com

    @Value("${aliyun.sms.accessKeyId}")
    private String accessKeyId;

    @Value("${aliyun.sms.accessKeySecret}")
    private String accessKeySecret;

    @Value("${aliyun.sms.signName}")
    private String signName;

    @Value("${aliyun.sms.templateCode}")
    private String templateCode;

    @Value("${aliyun.sms.region}")
    private String region;

    @Value("${aliyun.sms.endpoint}")
    private String endpoint;

    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;
    public static String SIGN_NAME;
    public static String TEMPLATE_CODE;
    public static String REGION;
    public static String ENDPOINT;
    @Override
    public void afterPropertiesSet() throws Exception {

        ACCESS_KEY_ID=accessKeyId;
        ACCESS_KEY_SECRET=accessKeySecret;
        SIGN_NAME=signName;
        TEMPLATE_CODE=templateCode;
        REGION=region;
        ENDPOINT=endpoint;

    }
}
