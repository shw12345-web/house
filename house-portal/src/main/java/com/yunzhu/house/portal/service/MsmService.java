package com.yunzhu.house.portal.service;

import vo.MsmVo;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 9:11
 */
public interface MsmService {

    //发送手机验证码
    boolean send(String phone, String code);
}
