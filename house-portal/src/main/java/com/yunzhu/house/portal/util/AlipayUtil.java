package com.yunzhu.house.portal.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayRequest;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradeCreateModel;
import com.alipay.api.domain.AlipayTradeFastpayRefundQueryModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeCreateRequest;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeCreateResponse;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.config.properties.AliAppletPayProperties;
import com.yunzhu.house.common.config.properties.AliPayProperties;
import com.yunzhu.house.common.enums.PayEnum;
import com.yunzhu.house.dto.other.PayCommonRes;
import com.yunzhu.house.dto.other.RefundParam;
import com.yunzhu.house.model.HouseOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component
public class AlipayUtil {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AliPayProperties aliPayProperties;

    @Autowired
    private AliAppletPayProperties aliAppletPayProperties;

    /**
     * 订单支付宝付款
     *
     * @param trade
     * @param type
     * @return
     */
    public CommonResult<String> pay(HouseOrder trade, String type) {
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(aliPayProperties.getUrl(), aliPayProperties.getAppId(), aliPayProperties.getPrivateKey(), aliPayProperties.getFormat(), aliPayProperties.getInput_charset(), aliPayProperties.getPublicKey(), aliPayProperties.getSignType());
        AlipayRequest request = null;

        request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody(trade.getOrderDesc());
        model.setSubject(trade.getOrderDesc());
        model.setOutTradeNo(trade.getOrderNo());
        model.setTimeoutExpress("30m");
        model.setTotalAmount(trade.getRenttotal().toString());
        request.setBizModel(model);
        request.setReturnUrl(aliPayProperties.getReturnUrl() + "?tradeNo=" + trade.getOrderNo());
        request.setNotifyUrl(aliPayProperties.getNotifyUrl());
        try {
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute((AlipayTradeAppPayRequest) request);
            log.debug(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
            return CommonResult.success(response.getBody(), "成功");

        } catch (AlipayApiException e) {
            log.error("payAli error", e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }

    }

    /**
     * 支付宝小程序订单支付宝付款
     *
     * @param trade
     * @param type
     * @return
     */
    public CommonResult<String> appletPay(HouseOrder trade, String userPid) {
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(aliAppletPayProperties.getUrl(), aliAppletPayProperties.getAppId(), aliAppletPayProperties.getPrivateKey(), aliAppletPayProperties.getFormat(), aliAppletPayProperties.getInput_charset(), aliAppletPayProperties.getPublicKey(), aliAppletPayProperties.getSignType());
        AlipayTradeCreateRequest request = null;
        request = new AlipayTradeCreateRequest();
        AlipayTradeCreateModel model = new AlipayTradeCreateModel();
        model.setBody(trade.getOrderDesc());
        model.setSubject(trade.getOrderDesc());
        model.setOutTradeNo(trade.getOrderNo());
        model.setTimeoutExpress("30m");
        model.setTotalAmount(trade.getRenttotal().toString());
        model.setSellerId(aliAppletPayProperties.getPartner());//收款账户
        model.setBuyerId(userPid);//在小程序场景内 alipay.trade.create 接口中的“buyer_id”为必填项
        request.setBizModel(model);
        request.setNotifyUrl(aliAppletPayProperties.getNotifyUrl());
        try {
            AlipayTradeCreateResponse response = alipayClient.execute(request);
            log.debug(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
            if (!"10000".equals(response.getCode())) {
                return PayEnum.F_TRADE_PAY_576.toResponse();
            }
            return new CommonResult<>(CommonResult.success().getCode() , response.getTradeNo());
        } catch (AlipayApiException e) {
            log.error("payAli error", e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }

    }


    public Map<String, String> payNotify(HttpServletRequest request) {
        try {
            //获取支付宝POST过来反馈信息
            Map<String, String> params = new HashMap<String, String>();
            Map<String, String> paramsUTF8 = new HashMap<String, String>();
            Map requestParams = request.getParameterMap();
            for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                params.put(name, valueStr);
                //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                paramsUTF8.put(name, valueStr);
            }
            log.info(params.toString());
            boolean verify_result = AlipaySignature.rsaCheckV1(params, aliPayProperties.getPublicKey(), aliPayProperties.getInput_charset(), aliPayProperties.getSignType())
                    || AlipaySignature.rsaCheckV1(paramsUTF8, aliPayProperties.getPublicKey(), aliPayProperties.getInput_charset(), aliPayProperties.getSignType());
            if (verify_result) {//验证成功
                return params;
            }
        } catch (Exception e) {
            log.error("payNotify error:", e);
        }
        return null;
    }


    /**
     * 支付宝小程序回调
     *
     * @param request
     * @return
     */
    public Map<String, String> appletPayNotify(HttpServletRequest request) {
        try {
            //获取支付宝POST过来反馈信息
            Map<String, String> params = new HashMap<String, String>();
            Map<String, String> paramsUTF8 = new HashMap<String, String>();
            Map requestParams = request.getParameterMap();
            for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i]
                            : valueStr + values[i] + ",";
                }
                params.put(name, valueStr);
                //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                paramsUTF8.put(name, valueStr);
            }
            log.info(params.toString());
            boolean verify_result = AlipaySignature.rsaCheckV1(params, aliAppletPayProperties.getPublicKey(), aliAppletPayProperties.getInput_charset(), aliAppletPayProperties.getSignType())
                    || AlipaySignature.rsaCheckV1(paramsUTF8, aliAppletPayProperties.getPublicKey(), aliAppletPayProperties.getInput_charset(), aliAppletPayProperties.getSignType());
            if (verify_result) {//验证成功
                return params;
            }
        } catch (Exception e) {
            log.error("appletPayNotify error:", e);
        }
        return null;
    }

    /**
     * 支付宝退款
     * @return
     */
    /*public Response<String> aliTradeRefund(Trade trade){
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(aliPayProperties.getUrl(), aliPayProperties.getAppId(), aliPayProperties.getPrivateKey(), aliPayProperties.getFormat(), aliPayProperties.getInput_charset(), aliPayProperties.getPublicKey(), aliPayProperties.getSignType());
        AlipayTradeRefundRequest  request = null;
        try {
            AlipayTradeRefundModel model = new AlipayTradeRefundModel();
            model.setOutTradeNo(trade.getTradeNo()); //支付号
            model.setRefundAmount(trade.getPriceTotal().toString());  //退款金额
           // model.setRefundAmount(String.valueOf(0.05));  //退款金额
            model.setOutRequestNo(trade.getTradeNo()+"TK");
            model.setRefundReason("商家退款");
            request = new AlipayTradeRefundRequest();
            request.setBizModel(model);
            AlipayTradeRefundResponse response = alipayClient.execute(request);
            log.info("aliTradeRefund response = ",response);
            if(response.isSuccess()){
                return ResponseCode.OK.toResponse(response.getBody(),"退款成功");
            }else{
                return ResponseCode.OK.toResponse(response.getBody(), response.getSubMsg());
            }
        } catch (Exception e) {
            log.error("tradeRefund error:",e);
            return ResponseCode.F_TRADE_PAY_576.toResponse();
        }
    }*/

    /**
     * 支付宝退款查询
     *
     * @param trade
     * @return
     */
    public CommonResult<String> queryAliPayRefund(HouseOrder trade) {
        AlipayClient alipayClient = new DefaultAlipayClient(aliPayProperties.getUrl(), aliPayProperties.getAppId(), aliPayProperties.getPrivateKey(), aliPayProperties.getFormat(), aliPayProperties.getInput_charset(), aliPayProperties.getPublicKey(), aliPayProperties.getSignType());
        AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
        AlipayTradeFastpayRefundQueryModel model = new AlipayTradeFastpayRefundQueryModel();
        model.setOutTradeNo(trade.getOrderNo());
        model.setOutRequestNo(trade.getOrderNo() + "TK");
        request.setBizModel(model);
        try {
            AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
            if (response.isSuccess()) {
                if (response.getTradeNo() != null) {
                    return CommonResult.success("300", "该笔订单退款成，交易号为：" + response.getTradeNo() + "，商户订单号为：" + response.getOutTradeNo());
                } else {
                    return CommonResult.success("200", "没有该笔交易");
                }
            } else {
                return CommonResult.success(response.getSubCode(), response.getSubMsg());
            }
        } catch (AlipayApiException e) {
            log.error("queryAliPayRefund error:", e);
            return PayEnum.F_TRADE_PAY_576.toResponse();
        }
    }

    public PayCommonRes refund(RefundParam refundParam) {
        PayCommonRes payCommonRes = new PayCommonRes();
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(aliPayProperties.getUrl(), aliPayProperties.getAppId(), aliPayProperties.getPrivateKey(), aliPayProperties.getFormat(), aliPayProperties.getInput_charset(), aliPayProperties.getPublicKey(), aliPayProperties.getSignType());
        AlipayTradeRefundRequest request = null;
        try {
            AlipayTradeRefundModel model = new AlipayTradeRefundModel();
            model.setOutTradeNo(refundParam.getTradeNo()); //支付号
            model.setRefundAmount(refundParam.getRefundAmount().toString());  //退款金额
            model.setOutRequestNo(refundParam.getLocalNo());
            model.setRefundReason("商家退款");
            request = new AlipayTradeRefundRequest();
            request.setBizModel(model);
            AlipayTradeRefundResponse response = alipayClient.execute(request);
            log.info("aliTradeRefund response = ", response);
            if (response.isSuccess()) {
                payCommonRes.setSuccess(true);
                payCommonRes.setPayNo(response.getTradeNo());
                payCommonRes.setMsg("退款成功");
            } else {
                payCommonRes.setSuccess(false);
                payCommonRes.setMsg(response.getSubMsg());
            }
        } catch (Exception e) {
            log.error("AlipayUtil  ------ >refund error:", e);
            payCommonRes.setSuccess(false);
            payCommonRes.setMsg("系统异常，请稍后再试");
        }
        return payCommonRes;
    }

    /**
     * 支付宝小程序退款
     *
     * @param refundParam
     * @return
     */
    public PayCommonRes appletRefund(RefundParam refundParam) {
        PayCommonRes payCommonRes = new PayCommonRes();
        //实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(aliAppletPayProperties.getUrl(), aliAppletPayProperties.getAppId(), aliAppletPayProperties.getPrivateKey(), aliAppletPayProperties.getFormat(), aliAppletPayProperties.getInput_charset(), aliAppletPayProperties.getPublicKey(), aliAppletPayProperties.getSignType());
        AlipayTradeRefundRequest request = null;
        try {
            AlipayTradeRefundModel model = new AlipayTradeRefundModel();
            model.setOutTradeNo(refundParam.getTradeNo()); //支付号
            model.setRefundAmount(refundParam.getRefundAmount().toString());  //退款金额
            model.setOutRequestNo(refundParam.getLocalNo());
            model.setRefundReason("商家退款");
            request = new AlipayTradeRefundRequest();
            request.setBizModel(model);
            AlipayTradeRefundResponse response = alipayClient.execute(request);
            log.info("aliTradeRefund response = ", response);
            if (response.isSuccess()) {
                payCommonRes.setSuccess(true);
                payCommonRes.setPayNo(response.getTradeNo());
                payCommonRes.setMsg("退款成功");
            } else {
                payCommonRes.setSuccess(false);
                payCommonRes.setMsg(response.getSubMsg());
            }
        } catch (Exception e) {
            log.error("AlipayUtil  ------ >refund error:", e);
            payCommonRes.setSuccess(false);
            payCommonRes.setMsg("系统异常，请稍后再试");
        }
        return payCommonRes;
    }
}
