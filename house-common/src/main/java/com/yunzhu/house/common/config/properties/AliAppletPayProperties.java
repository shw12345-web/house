package com.yunzhu.house.common.config.properties;

public class AliAppletPayProperties {

    private String url = "https://openapi.alipay.com/gateway.do";
//private String url = "https://openapi.alipaydev.com/gateway.do";
    private String format = "json";

    private String appId = "";

    // 合作身份者ID，以2088开头由16位纯数字组成的字符串
    private String partner = "";

    //商户的支付私钥
    private String privateKey = "";

    private String signType = "RSA";
    // 支付宝的公钥
    private String publicKey = "";

    private String input_charset = "UTF-8";

    //卖家支付宝账户
    private static String sellerEmail = "";

    //服务器异步通知页面路径
    //系统正式上线后修改
    private String notifyUrl = "";

    //页面跳转同步通知页面路径
    private String returnUrl = "";

    //充值付款异步通知地址
    private String rechargeNotifyUrl = "";

    //充值付款同步通知地址
    private String rechargeReturnUrl = "";

    //授权访问令牌的授权类型
    public String grantType = "";

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getInput_charset() {
        return input_charset;
    }

    public void setInput_charset(String input_charset) {
        this.input_charset = input_charset;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public static String getSellerEmail() {
        return sellerEmail;
    }

    public static void setSellerEmail(String sellerEmail) {
        AliAppletPayProperties.sellerEmail = sellerEmail;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getRechargeNotifyUrl() {
        return rechargeNotifyUrl;
    }

    public void setRechargeNotifyUrl(String rechargeNotifyUrl) {
        this.rechargeNotifyUrl = rechargeNotifyUrl;
    }

    public String getRechargeReturnUrl() {
        return rechargeReturnUrl;
    }

    public void setRechargeReturnUrl(String rechargeReturnUrl) {
        this.rechargeReturnUrl = rechargeReturnUrl;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

}
