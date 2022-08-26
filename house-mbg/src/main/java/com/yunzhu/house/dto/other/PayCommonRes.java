package com.yunzhu.house.dto.other;

import java.util.Map;

public class PayCommonRes {

    private boolean success = false;

    //支付或退款交易号
    private String payNo;

    //错误信息
    private String msg;

    //需要特殊处理数据
    private Map<String,Object> map;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
