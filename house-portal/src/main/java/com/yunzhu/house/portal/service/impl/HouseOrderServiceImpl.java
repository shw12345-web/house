package com.yunzhu.house.portal.service.impl;

import com.alipay.api.AlipayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.demo.trade.model.ExtendParams;
import com.alipay.demo.trade.model.GoodsDetail;
import com.alipay.demo.trade.model.builder.AlipayTradePrecreateRequestBuilder;
import com.alipay.demo.trade.model.result.AlipayF2FPrecreateResult;
import com.alipay.demo.trade.service.AlipayTradeService;
import com.alipay.demo.trade.utils.ZxingUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.support.Const;
import com.yunzhu.house.common.util.BigDecimalUtil;
import com.yunzhu.house.common.util.DateTimeUtil;
import com.yunzhu.house.common.util.FTPUtil;
import com.yunzhu.house.common.util.PropertiesUtil;
import com.yunzhu.house.mapper.HouseOrderMapper;
import com.yunzhu.house.model.HouseOrder;
import com.yunzhu.house.portal.service.HouseOrderService;
import com.yunzhu.house.portal.vo.HouseVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/25 11:52
 */
@Slf4j
@Service
public class HouseOrderServiceImpl extends ServiceImpl<HouseOrderMapper, HouseOrder> implements HouseOrderService {

    @Autowired
    private static AlipayTradeService tradeService;

    @Override
    public CommonResult pay(Long orderNo, Integer userId, String path) {
        Map<String, String> resultMap = Maps.newHashMap();
        QueryWrapper<HouseOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("", userId).eq("orderNo", orderNo);
        HouseOrder order = baseMapper.selectOne(queryWrapper);
        if (order == null) {
            return CommonResult.failed("用户没有该订单");
        }
        resultMap.put("orderNo", String.valueOf(order.getOrderNo()));


        // (必填) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线，
        // 需保证商户系统端不能重复，建议通过数据库sequence生成，
        String outTradeNo = order.getOrderNo().toString();


        // (必填) 订单标题，粗略描述用户的支付目的。如“xxx品牌xxx门店当面付扫码消费”
        String subject = new StringBuilder().append("happymmall扫码支付,订单号:").append(outTradeNo).toString();


        // (必填) 订单总金额，单位为元，不能超过1亿元
        // 如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
        String totalAmount = order.getRenttotal().toString();


        // (可选) 订单不可打折金额，可以配合商家平台配置折扣活动，如果酒水不参与打折，则将对应金额填写至此字段
        // 如果该值未传入,但传入了【订单总金额】,【打折金额】,则该值默认为【订单总金额】-【打折金额】
        String undiscountableAmount = "0";


        // 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
        // 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
        String sellerId = "";

        // 订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品2件共15.00元"
        String body = new StringBuilder().append("订单").append(outTradeNo).append("购买商品共").append(totalAmount).append("元").toString();


        // 商户操作员编号，添加此参数可以为商户操作员做销售统计
        String operatorId = "test_operator_id";

        // (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
        String storeId = "test_store_id";

        // 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
        ExtendParams extendParams = new ExtendParams();
        extendParams.setSysServiceProviderId("2088100200300400500");


        // 支付超时，定义为120分钟
        String timeoutExpress = "120m";

        // 商品明细列表，需填写购买商品详细信息，
        List<GoodsDetail> goodsDetailList = new ArrayList<GoodsDetail>();
        QueryWrapper<HouseOrder> query = new QueryWrapper<>();
        queryWrapper.eq("orderNo", order).eq("tenantid", userId);
        List<HouseOrder> orderItemList = baseMapper.selectList(query);
        for (HouseOrder orderItem : orderItemList) {
            GoodsDetail goods = GoodsDetail.newInstance(orderItem.getHouseid().toString(), orderItem.getHouseName(),
                    BigDecimalUtil.mul(orderItem.getAmount().doubleValue(), new Double(100).doubleValue()).longValue(),
                    orderItem.getQuantity());
            goodsDetailList.add(goods);
        }

        // 创建扫码支付请求builder，设置请求参数
        AlipayTradePrecreateRequestBuilder builder = new AlipayTradePrecreateRequestBuilder()
                .setSubject(subject).setTotalAmount(totalAmount).setOutTradeNo(outTradeNo)
                .setUndiscountableAmount(undiscountableAmount).setSellerId(sellerId).setBody(body)
                .setOperatorId(operatorId).setStoreId(storeId).setExtendParams(extendParams)
                .setTimeoutExpress(timeoutExpress)
                .setNotifyUrl(PropertiesUtil.getProperty("alipay.callback.url"))//支付宝服务器主动通知商户服务器里指定的页面http路径,根据需要设置
                .setGoodsDetailList(goodsDetailList);


        AlipayF2FPrecreateResult result = tradeService.tradePrecreate(builder);
        switch (result.getTradeStatus()) {
            case SUCCESS:
                log.info("支付宝预下单成功: )");

                AlipayTradePrecreateResponse response = result.getResponse();
                dumpResponse(response);

                File folder = new File(path);
                if (!folder.exists()) {
                    folder.setWritable(true);
                    folder.mkdirs();
                }

                // 需要修改为运行机器上的路径
                //细节细节细节
                String qrPath = String.format(path + "/qr-%s.png", response.getOutTradeNo());
                String qrFileName = String.format("qr-%s.png", response.getOutTradeNo());
                ZxingUtils.getQRCodeImge(response.getQrCode(), 256, qrPath);

                File targetFile = new File(path, qrFileName);
                try {
                    FTPUtil.uploadFile(Lists.newArrayList(targetFile));
                } catch (IOException e) {
                    log.error("上传二维码异常", e);
                }
                log.info("qrPath:" + qrPath);
                String qrUrl = PropertiesUtil.getProperty("ftp.server.http.prefix") + targetFile.getName();
                resultMap.put("qrUrl", qrUrl);
                return CommonResult.success(resultMap);
            case FAILED:
                log.error("支付宝预下单失败!!!");
                return CommonResult.failed("支付宝预下单失败!!!");

            case UNKNOWN:
                log.error("系统异常，预下单状态未知!!!");
                return CommonResult.failed("系统异常，预下单状态未知!!!");

            default:
                log.error("不支持的交易状态，交易返回异常!!!");
                return CommonResult.failed("不支持的交易状态，交易返回异常!!!");
        }
    }

    // 简单打印应答
    private void dumpResponse(AlipayResponse response) {
        if (response != null) {
            log.info(String.format("code:%s, msg:%s", response.getCode(), response.getMsg()));
            if (StringUtils.isNotEmpty(response.getSubCode())) {
                log.info(String.format("subCode:%s, subMsg:%s", response.getSubCode(),
                        response.getSubMsg()));
            }
            log.info("body:" + response.getBody());
        }
    }

    @Override
    public CommonResult aliCallback(Map<String, String> params) {
        Long orderNo = Long.parseLong(params.get("out_trade_no"));
        String tradeNo = params.get("trade_no");
        String tradeStatus = params.get("trade_status");
        QueryWrapper<HouseOrder> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("orderNo",orderNo);
        HouseOrder order = baseMapper.selectOne(queryWrapper);
        if(order == null){
            return CommonResult.failed("非快乐慕商城的订单,回调忽略");
        }
        if(order.getStatus() >= Const.OrderStatusEnum.PAID.getCode()){
            return CommonResult.failed("支付宝重复调用");
        }
        if(Const.AlipayCallback.TRADE_STATUS_TRADE_SUCCESS.equals(tradeStatus)){
            order.setPaymentTime(DateTimeUtil.strToDate(params.get("gmt_payment")));
            order.setStatus(Const.OrderStatusEnum.PAID.getCode());
            baseMapper.updateById(order);
        }

//        PayInfo payInfo = new PayInfo();
//        payInfo.setUserId(order.getUserId());
//        payInfo.setOrderNo(order.getOrderNo());
//        payInfo.setPayPlatform(Const.PayPlatformEnum.ALIPAY.getCode());
//        payInfo.setPlatformNumber(tradeNo);
//        payInfo.setPlatformStatus(tradeStatus);
//
//        payInfoMapper.insert(payInfo);

        return CommonResult.success();
    }

    @Override
    public CommonResult queryOrderPayStatus(Integer userId, Long orderNo) {
        return null;
    }

    @Override
    public CommonResult createOrder(Integer userId, Integer shippingId) {
        return null;
    }

    @Override
    public CommonResult<String> cancel(Integer userId, Long orderNo) {
        return null;
    }

    @Override
    public CommonResult getOrderCartHouse(Integer userId) {
        return null;
    }

    @Override
    public CommonResult<HouseVo> getOrderDetail(Integer userId, Long orderNo) {
        return null;
    }

    @Override
    public CommonResult<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize) {
        return null;
    }
}
