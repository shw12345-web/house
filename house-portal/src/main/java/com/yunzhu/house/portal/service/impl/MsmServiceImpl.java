package com.yunzhu.house.portal.service.impl;

import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.portal.service.MsmService;
import com.yunzhu.house.portal.service.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 9:25
 */
@Service
public class MsmServiceImpl implements MsmService {

    @Autowired
    private SendSmsService sendSmsService;


    @Override
    public boolean send(String phone, String code) {
        //判断手机号是否为空
        if(StringUtils.isEmpty(phone)) {
            return false;
        }
        return sendSmsService.sendSms(phone);

    }
}
