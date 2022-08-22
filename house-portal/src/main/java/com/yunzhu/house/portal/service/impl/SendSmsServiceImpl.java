package com.yunzhu.house.portal.service.impl;

import com.aliyun.auth.credentials.Credential;
import com.aliyun.auth.credentials.provider.StaticCredentialProvider;
import com.aliyun.sdk.service.dysmsapi20170525.AsyncClient;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.sdk.service.dysmsapi20170525.models.SendSmsResponse;
import com.google.gson.Gson;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.portal.service.SendSmsService;
import com.yunzhu.house.portal.util.ConstantPropertiesUtils;
import com.yunzhu.house.portal.util.RandomUtil;
import darabonba.core.client.ClientOverrideConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 10:26
 */
@Service
@Slf4j
public class SendSmsServiceImpl implements SendSmsService {
    @Override
    public boolean sendSms(String phone) {
        CommonResult result = new CommonResult();
        StaticCredentialProvider provider = StaticCredentialProvider.create(Credential.builder()
                .accessKeyId(ConstantPropertiesUtils.ACCESS_KEY_ID)
                .accessKeySecret(ConstantPropertiesUtils.ACCESS_KEY_SECRET)
                .build());
        AsyncClient client = AsyncClient.builder()
                .region(ConstantPropertiesUtils.REGION)
                .credentialsProvider(provider)
                .overrideConfiguration(
                        ClientOverrideConfiguration.create()
                                .setEndpointOverride(ConstantPropertiesUtils.ENDPOINT)
                ).build();
        String code = RandomUtil.getRandom();
        Gson gson = new Gson();
        Map map = new HashMap();
        map.put("code", code);
        SendSmsRequest sendSmsRequest = SendSmsRequest.builder()
                .signName(ConstantPropertiesUtils.SIGN_NAME)
                .templateCode(ConstantPropertiesUtils.TEMPLATE_CODE)
                .phoneNumbers(phone)
                .templateParam(gson.toJson(map))
                .build();
        CompletableFuture<SendSmsResponse> response = client.sendSms(sendSmsRequest);
        SendSmsResponse resp = null;
        try {
            resp = response.get();
            log.info("手机" + "短信发送成功", new Gson().toJson(resp));
            client.close();
            return true;
        } catch (Exception e) {
            log.error(phone + "发送失败" + e.getMessage());
            return false;
        }
    }
}
