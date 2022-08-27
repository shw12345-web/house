package com.yunzhu.house.portal.util;

import com.icbc.api.IcbcApiException;
import com.icbc.api.IcbcConstants;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.request.ThirdpartyOrderPayRequestV3;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.common.config.IcbcConfig;
import com.yunzhu.house.common.config.properties.IcbcProperties;
import com.yunzhu.house.model.HouseOrder;
import com.yunzhu.house.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 工银支付
 * Created by ybds on 2018-12-28.
 */
@Component
public class ICBPayUtil {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IcbcProperties icbcProperties;

    public CommonResult<String> pay(HouseOrder trade, SysUser booker) {

        SimpleDateFormat tradeDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat tradeTime = new SimpleDateFormat("HHmmss");
        Date createTime = new Date();
        String msgId = getCharAndNumr(30);

        UiIcbcClient client = new UiIcbcClient(IcbcConfig.ICBC_APPID, IcbcConstants.SIGN_TYPE_RSA2, IcbcConfig.ICBC_PRIVATE_KEY, IcbcConstants.CHARSET_UTF8, IcbcConstants.ENCRYPT_TYPE_AES, IcbcConfig.ICBC_AES_KEY);
        ThirdpartyOrderPayRequestV3 request = new ThirdpartyOrderPayRequestV3();

        request.setServiceUrl(IcbcConfig.ICBC_PAY);

        ThirdpartyOrderPayRequestV3.ThirdpartyOrderPayRequestV3Biz bizContent = new ThirdpartyOrderPayRequestV3.ThirdpartyOrderPayRequestV3Biz();
        bizContent.setMerId(IcbcConfig.ICBC_MER_ID);
        bizContent.setStoreCode(IcbcConfig.ICBC_STORE_CODE);
        //todo
//        bizContent.setCustId(booker.getIcbCustId());
        bizContent.setOutTradeNo(trade.getOrderNo());
        bizContent.setOrderAmt(String.valueOf((int) (Double.parseDouble(trade.getRenttotal().toString()) * 100)));
        bizContent.setTradeDate(tradeDate.format(createTime));
        bizContent.setTradeTime(tradeTime.format(createTime));
        bizContent.setPayExpire("1800");
        bizContent.setNotifyUrl(icbcProperties.getNotifyUrl());
        bizContent.setNotifyFlag("1");
        bizContent.setAutoSubmitFlag("0");

        request.setBizContent(bizContent);
        try {
            String body = client.buildPostForm(request, msgId);
            return CommonResult.success(body,"成功");
        } catch (IcbcApiException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 随机字符串
     *
     * @param length
     * @return
     */
    public String getCharAndNumr(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 输出字母还是数字
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            // 字符串
            if ("char".equalsIgnoreCase(charOrNum)) {
                // 取得大写字母还是小写字母
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (choice + random.nextInt(26));
            } else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }

}
