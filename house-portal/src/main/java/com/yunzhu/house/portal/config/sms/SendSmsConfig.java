package com.yunzhu.house.portal.config.sms;

import com.aliyun.auth.credentials.Credential;
import com.aliyun.auth.credentials.provider.StaticCredentialProvider;
import com.aliyun.sdk.service.dysmsapi20170525.AsyncClient;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsResponse;
import com.google.gson.Gson;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.portal.util.RandomUtil;
import darabonba.core.client.ClientOverrideConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * TODO
 *
 * @author 发送短信工具
 * @date 2022/8/8 8:40
 */


@Slf4j
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "sms")
public class SendSmsConfig {


    @Value("${sms.accessKeyId}")
    private static String accessKeyId;

    @Value("${sms.accessKeySecret}")
    private static String accessKeySecret;

    @Value("${sms.signName}")
    private static String signName;

    @Value("${sms.templateCode}")
    private static String templateCode;

    @Value("${sms.endpoint}")
    private static String endpoint;

    @Value("${sms.region}")
    private static String region;

    public static void main(String[] args) {
        System.out.println(templateCode);
    }

    /**
     * 发送短信
     *
     * @param phone
     * @return
     */
    public CommonResult sendSms(String phone) {
        CommonResult result = new CommonResult();
        StaticCredentialProvider provider = StaticCredentialProvider.create(Credential.builder()
                .accessKeyId(accessKeyId)
                .accessKeySecret(accessKeySecret)
                .build());
        AsyncClient client = AsyncClient.builder()
                .region(region)
                .credentialsProvider(provider)
                .overrideConfiguration(
                        ClientOverrideConfiguration.create()
                                .setEndpointOverride(endpoint)
                ).build();
        String code = RandomUtil.getRandom();
        Gson gson = new Gson();
        Map map = new HashMap();
        map.put("code", code);
        SendSmsRequest sendSmsRequest = SendSmsRequest.builder()
                .signName(signName)
                .templateCode(templateCode)
                .phoneNumbers(phone)
                .templateParam(gson.toJson(map))
                .build();
        CompletableFuture<SendSmsResponse> response = client.sendSms(sendSmsRequest);
        SendSmsResponse resp = null;
        try {
            resp = response.get();
            result.setData(resp.getBody());
            log.info("手机" + "短信发送成功", new Gson().toJson(resp));
            client.close();
            return result;
        } catch (Exception e) {
            log.error(phone + "发送失败" + e.getMessage());
            result.setCode(500);
            result.setMessage(e.getMessage());
            return result;
        }

    }

}
