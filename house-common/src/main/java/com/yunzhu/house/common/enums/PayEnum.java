package com.yunzhu.house.common.enums;

import com.alibaba.fastjson.JSON;
import com.yunzhu.house.common.api.CommonResult;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/26 8:49
 */
public enum PayEnum {

    F_TRADE_PAY_576(20576L,"支付请求异常");


    private Long code;

    private String msg;

    PayEnum(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public PayEnum setMsg(String msg){
        this.msg = msg;
        return this;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public CommonResult toResponse() {
        return new CommonResult(code, msg);
    }

    public CommonResult toResponse(String msg) {
        return new CommonResult(code, msg);
    }

    public <T> CommonResult<T> toResponse(T data) {
        return new CommonResult<>(code, msg, data);
    }

    public <T> CommonResult<T> toResponse(T data, String msg) {
        return new CommonResult<>(code, msg, data);
    }

    public String toResponseJson() {
        CommonResult response = new CommonResult(code, msg);
        String json = JSON.toJSONString(response);
        return json;
    }
}
