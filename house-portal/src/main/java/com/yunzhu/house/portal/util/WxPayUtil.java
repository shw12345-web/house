package com.yunzhu.house.portal.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConstants;
import com.github.wxpay.sdk.WXPayUtil;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.config.properties.WxPayJSProperties;
import com.yunzhu.house.common.config.properties.WxPayProperties;
import com.yunzhu.house.common.config.properties.WxPayXCXProperties;
import com.yunzhu.house.common.enums.PayEnum;
import com.yunzhu.house.common.support.HttpServeltContext;
import com.yunzhu.house.dto.other.PayCommonRes;
import com.yunzhu.house.dto.other.RefundParam;
import com.yunzhu.house.model.HouseOrder;
import com.yunzhu.house.portal.config.wx.MyWxPayConfig;
import com.yunzhu.house.portal.config.wx.MyWxPayJSConfig;
import com.yunzhu.house.portal.config.wx.MyWxPayXCXConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class WxPayUtil {


    @Autowired
    private WxPayProperties wxProperties;

    @Autowired
    private WxPayJSProperties wxjsProperties;

    @Autowired
    private WxPayXCXProperties wxXCXProperties;

    public Map<String,String> payNotifyApp(HttpServletRequest request) {
        try {
            InputStream inStream = request.getInputStream();
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            outSteam.close();
            inStream.close();
            String result = new String(outSteam.toByteArray(), "utf-8");//获取微信调用我们notify_url的返回信息
            log.info("微支付通知结果：" + result);
            Map<String, String> notifyMap = WXPayUtil.xmlToMap(result);  // 转换成map
            MyWxPayConfig myWxPayConfig = MyWxPayConfig.getInstance();
            WXPay wxpay = new WXPay(myWxPayConfig);
            if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
                return notifyMap;
            }else{
                log.info("payNotifyApp error:签名验证错误");
            }
        }catch (Exception e){
            log.error("payNotifyApp error:",e);
        }
        return null;
    }

    public Map<String,String> payNotify(HttpServletRequest request) {
        try {
            InputStream inStream = request.getInputStream();
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            outSteam.close();
            inStream.close();
            String result = new String(outSteam.toByteArray(), "utf-8");//获取微信调用我们notify_url的返回信息
            log.info("微支付通知结果：" + result);
            Map<String, String> notifyMap = WXPayUtil.xmlToMap(result);  // 转换成map
            MyWxPayJSConfig myWxPayConfig = MyWxPayJSConfig.getInstance();
            WXPay wxpay = new WXPay(myWxPayConfig);
            if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
                return notifyMap;
            }else{
                log.info("payNotify error:签名验证错误");
            }
        }catch (Exception e){
            log.error("payNotify error:",e);
        }
        return null;
    }

    public Map<String,String> payNotifyXCX(HttpServletRequest request) {
        try {
            InputStream inStream = request.getInputStream();
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }
            outSteam.close();
            inStream.close();
            String result = new String(outSteam.toByteArray(), "utf-8");//获取微信调用我们notify_url的返回信息
            log.info("微支付通知结果：" + result);
            Map<String, String> notifyMap = WXPayUtil.xmlToMap(result);  // 转换成map
            MyWxPayXCXConfig myWxPayConfig = MyWxPayXCXConfig.getInstance();
            WXPay wxpay = new WXPay(myWxPayConfig);
            if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
                return notifyMap;
            }else{
                log.info("payNotify error:签名验证错误");
            }
        }catch (Exception e){
            log.error("payNotify error:",e);
        }
        return null;
    }

    public Map<String, String> createPackage(Map<String, String> data) throws Exception {
        HashMap<String, String> nativeObj = new HashMap<String, String>();
        String trade_type = data.get("trade_type");
        if("APP".equalsIgnoreCase(trade_type)){
            MyWxPayConfig myWxPayConfig = MyWxPayConfig.getInstance();
            WXPay wxpay = new WXPay(myWxPayConfig);
            Map<String, String> resp = wxpay.unifiedOrder(data);
            log.info("微信获取prepayId: " + JSON.toJSONString(resp));
            String timestamp = Long.toString(new Date().getTime()/1000);
            String prepay_id = resp.get("prepay_id");
            nativeObj.put("package", "Sign=WXPay");
            nativeObj.put("prepayid", prepay_id);
            nativeObj.put("appid", myWxPayConfig.getAppID());
            nativeObj.put("timestamp",timestamp);
            nativeObj.put("noncestr", WXPayUtil.generateNonceStr());
            nativeObj.put("partnerid", myWxPayConfig.getPartnerId());

            nativeObj.put("sign", WXPayUtil.generateSignature(nativeObj, myWxPayConfig.getKey(), WXPayConstants.SignType.MD5));

        }else if("JSAPI".equalsIgnoreCase(trade_type)){
            MyWxPayJSConfig myWxPayConfig = MyWxPayJSConfig.getInstance();
            WXPay wxpay = new WXPay(myWxPayConfig);
            Map<String, String> resp = wxpay.unifiedOrder(data);
            log.info("微信获取prepayId: " + JSON.toJSONString(resp));
            String timestamp = Long.toString(new Date().getTime()/1000);
            String prepay_id = resp.get("prepay_id");
            nativeObj.put("package", "prepay_id="+prepay_id);
            nativeObj.put("appId", myWxPayConfig.getAppID());
            nativeObj.put("timeStamp", timestamp);
            nativeObj.put("nonceStr", WXPayUtil.generateNonceStr());
            nativeObj.put("package", "prepay_id="+prepay_id);
            nativeObj.put("signType", WXPayConstants.MD5);

            nativeObj.put("paySign", WXPayUtil.generateSignature(nativeObj, myWxPayConfig.getKey(), WXPayConstants.SignType.MD5));
        }
        return nativeObj;
    }


    public Map<String, String> createAppletPackage(Map<String, String> data) throws Exception {
        HashMap<String, String> nativeObj = new HashMap<String, String>();
        String trade_type = data.get("trade_type");

        MyWxPayXCXConfig myWxPayConfig = MyWxPayXCXConfig.getInstance();
        WXPay wxpay = new WXPay(myWxPayConfig);
        Map<String, String> resp = wxpay.unifiedOrder(data);
        log.info("微信获取prepayId: " + JSON.toJSONString(resp));
        String timestamp = Long.toString(new Date().getTime()/1000);
        String prepay_id = resp.get("prepay_id");
        nativeObj.put("package", "prepay_id="+prepay_id);
        nativeObj.put("appId", myWxPayConfig.getAppID());
        nativeObj.put("timeStamp", timestamp);
        nativeObj.put("nonceStr", WXPayUtil.generateNonceStr());
        nativeObj.put("package", "prepay_id="+prepay_id);
        nativeObj.put("signType", WXPayConstants.MD5);

        nativeObj.put("paySign", WXPayUtil.generateSignature(nativeObj, myWxPayConfig.getKey(), WXPayConstants.SignType.MD5));
        return nativeObj;
    }

    public CommonResult<String> pay(HouseOrder trade, String type, String openId) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("body", trade.getOrderDesc());
        data.put("out_trade_no", trade.getOrderNo());
        data.put("total_fee", trade.getRenttotal().toString());
        data.put("spbill_create_ip", HttpServeltContext.getIp());
        if("APP".equalsIgnoreCase(type)){
            data.put("trade_type", "APP");
            data.put("notify_url", wxProperties.getNotifyUrl());
        }else {
            data.put("trade_type", "JSAPI");
            data.put("notify_url", wxjsProperties.getNotifyUrl());
            data.put("openid", openId);
        }
        try {
            return CommonResult.success(JSONObject.toJSONString(createPackage(data)),"成功");
        } catch (Exception e) {
            log.error("payWX error",e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }
    }

    public CommonResult<String> wxAppletPay(HouseOrder trade, String type,String openId) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("body", trade.getOrderDesc());
        data.put("out_trade_no", trade.getOrderNo());
        data.put("total_fee",trade.getRenttotal() .toString());
        data.put("spbill_create_ip", HttpServeltContext.getIp());
        data.put("trade_type", "JSAPI");
        data.put("notify_url", wxXCXProperties.getNotifyUrl());
        data.put("openid", openId);
        try {
            return CommonResult.success(JSONObject.toJSONString(createAppletPackage(data)),"成功");
        } catch (Exception e) {
            log.error("payWX error",e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }
    }

    /**
     * 微信退款
     * @return
     */
    public CommonResult<String> weChatTradeRefund(HouseOrder trade){
        double totalPriceDouble = trade.getRenttotal().doubleValue()*100;
        int  totalPriceInt = (int) totalPriceDouble;   //订单金额  微信支付api 钱一定要是整数 分为单位
        int rufPrice = 10;   //退款金额  分为单位 暂时写死
        try {
            MyWxPayJSConfig myWxPayJSConfig = MyWxPayJSConfig.getInstance(); //获取微信通用参数 JS
            WXPay wxpayJs = new WXPay(myWxPayJSConfig);
            Map<String, String> mJs = new HashMap<>();
            mJs.put("appid", myWxPayJSConfig.getAppID());
            mJs.put("mch_id", myWxPayJSConfig.getMchID());
            mJs.put("nonce_str", WXPayUtil.generateNonceStr());
            mJs.put("out_trade_no", trade.getOrderNo());
            mJs.put("out_refund_no", trade.getOrderNo() +"TK");
            mJs.put("total_fee", String.valueOf(totalPriceInt));
            mJs.put("refund_fee", String.valueOf(rufPrice));
            String signJs = WXPayUtil.generateSignature(mJs, myWxPayJSConfig.getKey(), WXPayConstants.SignType.MD5);
            mJs.put("sign", signJs);
            Map<String, String> respJs = wxpayJs.refund(mJs);
            log.info("JS退款返回码："+respJs.get("return_code")+"，返回内容："+respJs.get("return_msg"));
            if(respJs.get("return_code").equals("SUCCESS")){
                //请求成功
                if(respJs.get("result_code").equals("SUCCESS")){ //业务成功
                    log.info("JS退款业务成功返回码："+respJs.get("result_code"));
                    return CommonResult.success(respJs.get("result_code"),"退款成功（JS）");
                }else{
                    //另外一种情况
                    if(respJs.get("err_code").equals("ORDERNOTEXIST")){
                        MyWxPayConfig myWxPayConfig  = MyWxPayConfig.getInstance(); //获取微信通用参数 App
                        WXPay wxpay = new WXPay(myWxPayConfig);
                        Map<String, String> m = new HashMap<>();
                        m.put("appid", myWxPayConfig.getAppID());
                        m.put("mch_id", myWxPayConfig.getMchID());
                        m.put("nonce_str", WXPayUtil.generateNonceStr());
                        m.put("out_trade_no", trade.getOrderNo());
                        m.put("out_refund_no", trade.getOrderNo() +"TK");
                        m.put("total_fee", String.valueOf(totalPriceInt));
                        m.put("refund_fee", String.valueOf(rufPrice));
                        String sign = WXPayUtil.generateSignature(m, myWxPayConfig.getKey(), WXPayConstants.SignType.MD5);
                        m.put("sign", sign);
                        Map<String, String> respApp = wxpay.refund(m);
                        log.info("App退款返回码："+respApp.get("return_code")+"，返回内容："+respApp.get("return_msg"));
                        if(respApp.get("return_code").equals("SUCCESS")){
                            //请求成功
                            if(respApp.get("result_code").equals("SUCCESS")){
                                log.info("APP退款业务成功返回码："+respApp.get("result_code"));
                                return CommonResult.success(respApp.get("result_code"),"退款成功（APP）");
                            }else{
                                return CommonResult.failed(respApp.get("err_code_des"));
                            }
                        }else{
                            return CommonResult.failed(respApp.get("return_msg"));
                        }
                    }else{
                        return CommonResult.failed(respJs.get("err_code_des"));
                    }
                }
            }else{
                return CommonResult.failed(respJs.get("return_msg"));
            }
        } catch (Exception e) {
            log.error("weChartTradeRefund error",e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }
    }

    /**
     * 微信退款查询
     * @return
     */
    public CommonResult<String> queryWechatPayRefund(HouseOrder trade){
        try {
            //js
            MyWxPayJSConfig myWxPayJSConfig = MyWxPayJSConfig.getInstance();
            WXPay wxpayJs = new WXPay(myWxPayJSConfig);
            Map<String, String> mJs = new HashMap<>();
            mJs.put("appid", myWxPayJSConfig.getAppID());
            mJs.put("mch_id", myWxPayJSConfig.getMchID());
            mJs.put("nonce_str", WXPayUtil.generateNonceStr());
            mJs.put("out_trade_no", trade.getOrderNo());
            String signJs = WXPayUtil.generateSignature(mJs, myWxPayJSConfig.getKey(), WXPayConstants.SignType.MD5);
            mJs.put("sign", signJs);
            Map<String, String> respJs = wxpayJs.refundQuery(mJs);
            if(respJs.get("return_code").equals("SUCCESS")){
                if(respJs.get("result_code").equals("SUCCESS")){
                    return CommonResult.success("300","该笔订单退款成功，微信订单号为："+respJs.get("transaction_id")+"，商户订单号为："+respJs.get("out_trade_no"));
                }else{
                    //app
                    if(respJs.get("err_code").equals("REFUNDNOTEXIST")){
                        MyWxPayConfig myWxPayConfig  = MyWxPayConfig.getInstance(); //获取微信通用参数 App
                        WXPay wxpay = new WXPay(myWxPayConfig);
                        Map<String, String> m = new HashMap<>();
                        m.put("appid", myWxPayConfig.getAppID());
                        m.put("mch_id", myWxPayConfig.getMchID());
                        m.put("nonce_str", WXPayUtil.generateNonceStr());
                        m.put("out_trade_no", trade.getOrderNo());
                        String sign = WXPayUtil.generateSignature(m, myWxPayConfig.getKey(), WXPayConstants.SignType.MD5);
                        m.put("sign", sign);
                        Map<String, String> respApp = wxpay.refundQuery(m);
                        if(respApp.get("return_code").equals("SUCCESS")){
                            if(respApp.get("result_code").equals("SUCCESS")){
                                return CommonResult.success("300","该笔订单退款成功，微信订单号为："+respApp.get("transaction_id")+"，商户订单号为："+respApp.get("out_trade_no"));
                            }else{
                                return CommonResult.failed("200","没有该笔交易");
                            }
                        }else{
                            return CommonResult.failed(respApp.get("return_code"),respApp.get("return_msg"));
                        }
                    }else{
                        return CommonResult.failed(respJs.get("err_code"),respJs.get("err_code_des"));
                    }
                }
            }else{
                return CommonResult.failed(respJs.get("return_code"),respJs.get("return_msg"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public PayCommonRes refund(RefundParam refundParam, String source) {
        if("APP".equalsIgnoreCase(source)){
            return this.refundApp(refundParam,true);
        }else{
            return this.refundJsapi(refundParam,true);
        }
    }

    public PayCommonRes refundJsapi(RefundParam refundParam,boolean flag) {
        PayCommonRes payCommonRes = new PayCommonRes();
        //jsapi账号退款
        MyWxPayJSConfig myWxPayJSConfig = MyWxPayJSConfig.getInstance(); //获取微信通用参数 JS
        try {
            int totlePrice = Double.valueOf(refundParam.getPayAmount()*100).intValue();
            int refundPrice = Double.valueOf(refundParam.getRefundAmount()*100).intValue();
            WXPay wxpayJs = new WXPay(myWxPayJSConfig);
            Map<String, String> mJs = new HashMap<>();
            mJs.put("appid", myWxPayJSConfig.getAppID());
            mJs.put("mch_id", myWxPayJSConfig.getMchID());
            mJs.put("nonce_str", WXPayUtil.generateNonceStr());
            mJs.put("out_trade_no", refundParam.getTradeNo());
            mJs.put("out_refund_no", refundParam.getLocalNo());
            mJs.put("total_fee", String.valueOf(totlePrice));
            mJs.put("refund_fee", String.valueOf(refundPrice));
            String signJs = WXPayUtil.generateSignature(mJs, myWxPayJSConfig.getKey(), WXPayConstants.SignType.MD5);
            mJs.put("sign", signJs);
            Map<String, String> respJs = wxpayJs.refund(mJs);
            log.info("JS退款返回码："+respJs.get("return_code")+"，返回内容："+respJs.get("return_msg"));
            if(respJs.get("return_code").equals("SUCCESS")){
                if(respJs.get("result_code").equals("SUCCESS")){
                    payCommonRes.setSuccess(true);
                    payCommonRes.setPayNo(respJs.get("refund_id"));
                    payCommonRes.setMsg("退款成功");
                }else{
                    if(respJs.get("err_code").equals("ORDERNOTEXIST")){
                        //如果退款失败，且flag为true，则调用app账号退款
                        if(flag){
                            return this.refundApp(refundParam,false);
                        }else{
                            payCommonRes.setSuccess(false);
                            payCommonRes.setMsg(respJs.get("err_code_des"));
                        }
                    }else{
                        payCommonRes.setSuccess(false);
                        payCommonRes.setMsg(respJs.get("err_code_des"));
                    }
                }
            }else{
                payCommonRes.setSuccess(false);
                payCommonRes.setMsg(respJs.get("return_msg"));
            }
        } catch (Exception e) {
           log.error("xPayUtil --------- > refundJsapi",e);
            payCommonRes.setSuccess(false);
            payCommonRes.setMsg("系统异常，请稍后再试");
        }
        return payCommonRes;
    }

    public PayCommonRes refundApp(RefundParam refundParam,boolean flag) {
        int totlePrice = Double.valueOf(refundParam.getPayAmount()*100).intValue();
        int refundPrice = Double.valueOf(refundParam.getRefundAmount()*100).intValue();
        PayCommonRes payCommonRes = new PayCommonRes();
        //app账号退款
        MyWxPayConfig appWxPayConfig  = MyWxPayConfig.getInstance(); //获取微信通用参数 App
        try {
            WXPay wxpay = new WXPay(appWxPayConfig);
            Map<String, String> m = new HashMap<>();
            m.put("appid", appWxPayConfig.getAppID());
            m.put("mch_id", appWxPayConfig.getMchID());
            m.put("nonce_str", WXPayUtil.generateNonceStr());
            m.put("out_trade_no", refundParam.getTradeNo());
            m.put("out_refund_no", refundParam.getLocalNo());
            m.put("total_fee", String.valueOf(totlePrice));
            m.put("refund_fee", String.valueOf(refundPrice));
            String sign = WXPayUtil.generateSignature(m, appWxPayConfig.getKey(), WXPayConstants.SignType.MD5);
            m.put("sign", sign);
            Map<String, String> respApp = wxpay.refund(m);
            log.info("App退款返回码："+respApp.get("return_code")+"，返回内容："+respApp.get("return_msg"));
            if(respApp.get("return_code").equals("SUCCESS")){
                if(respApp.get("result_code").equals("SUCCESS")){
                    payCommonRes.setSuccess(true);
                    payCommonRes.setPayNo(respApp.get("refund_id"));
                    payCommonRes.setMsg("退款成功");
                }else{
                    if(respApp.get("err_code").equals("ORDERNOTEXIST")){
                        //如果退款失败，且flag为true，则调用jsapi账号退款
                        if(flag){
                            return this.refundJsapi(refundParam,false);
                        }else{
                            payCommonRes.setSuccess(false);
                            payCommonRes.setMsg(respApp.get("err_code_des"));
                        }
                    }else{
                        payCommonRes.setSuccess(false);
                        payCommonRes.setMsg(respApp.get("err_code_des"));
                    }
                }
            }else{
                payCommonRes.setSuccess(false);
                payCommonRes.setMsg(respApp.get("return_msg"));
            }
        } catch (Exception e) {
            log.error("WxPayUtil --------- > refundApp",e);
            payCommonRes.setSuccess(false);
            payCommonRes.setMsg("系统异常，请稍后再试");
        }
        return payCommonRes;
    }

    public PayCommonRes refundXCX(RefundParam refundParam) {
        PayCommonRes payCommonRes = new PayCommonRes();
        //小程序账号退款
        MyWxPayXCXConfig myWxPayXCXConfig = MyWxPayXCXConfig.getInstance(); //获取微信通用参数 XCX
        try {
            int totlePrice = Double.valueOf(refundParam.getPayAmount()*100).intValue();
            int refundPrice = Double.valueOf(refundParam.getRefundAmount()*100).intValue();
            WXPay wxpayJs = new WXPay(myWxPayXCXConfig);
            Map<String, String> mJs = new HashMap<>();
            mJs.put("appid", myWxPayXCXConfig.getAppID());
            mJs.put("mch_id", myWxPayXCXConfig.getMchID());
            mJs.put("nonce_str", WXPayUtil.generateNonceStr());
            mJs.put("out_trade_no", refundParam.getTradeNo());
            mJs.put("out_refund_no", refundParam.getLocalNo());
            mJs.put("total_fee", String.valueOf(totlePrice));
            mJs.put("refund_fee", String.valueOf(refundPrice));
            String signJs = WXPayUtil.generateSignature(mJs, myWxPayXCXConfig.getKey(), WXPayConstants.SignType.MD5);
            mJs.put("sign", signJs);
            log.info(mJs.toString());
            Map<String, String> respJs = wxpayJs.refund(mJs);
            log.info("XCX退款返回码："+respJs.get("return_code")+"，返回内容："+respJs.get("return_msg"));
            if(respJs.get("return_code").equals("SUCCESS")){
                if(respJs.get("result_code").equals("SUCCESS")){
                    payCommonRes.setSuccess(true);
                    payCommonRes.setPayNo(respJs.get("refund_id"));
                    payCommonRes.setMsg("退款成功");
                }else{
                    if(respJs.get("err_code").equals("ORDERNOTEXIST")){
                        payCommonRes.setSuccess(false);
                        payCommonRes.setMsg(respJs.get("err_code_des"));
                    }else{
                        payCommonRes.setSuccess(false);
                        payCommonRes.setMsg(respJs.get("err_code_des"));
                    }
                }
            }else{
                payCommonRes.setSuccess(false);
                payCommonRes.setMsg(respJs.get("return_msg"));
            }
        } catch (Exception e) {
            log.error("xPayUtil --------- > refundXCX",e);
            payCommonRes.setSuccess(false);
            payCommonRes.setMsg("系统异常，请稍后再试");
        }
        return payCommonRes;
    }


}
