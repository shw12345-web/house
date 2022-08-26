package com.yunzhu.house.dto.enums;


import com.baomidou.mybatisplus.annotation.IEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单方式
 */
public enum TradePayWayEnum implements IEnum {
	ALIPAY("支付宝支付",1,"7","/pay/create.htm?tradeNo=",2,"支付宝支付","PAID",true),
	WEIXIN("微信支付",1,"7","/weixin/create.htm?tradeNo=",2,"微信支付","PAID",true),
    WEIXINAPPLET("微信小程序支付",1,"7","/weixin/create.htm?tradeNo=",2,"微信支付","PAID",true),
    ALIAPPLETPAY("支付宝小程序支付",1,"7","/pay/create.htm?tradeNo=",2,"支付宝小程序支付","PAID",true),
	UNIONPAY("银联支付",1,"7","/unionpay/create.htm?tradeNo=",2,"银联支付","PAID",true),
	WEALTH("返现账户支付",1,"7","/m/trade/pay.htm?trade.tradeNo=",2,"返现账户支付","PAID",false),
	CARD("会员卡",1,"7","/m/trade/pay.htm?trade.tradeNo=",2,"卡值支付","PAID",true),
	POINTS("积分支付",1,"7","/m/trade/pay.htm?trade.tradeNo=",1,"积分支付","PAID",false),
	VOUCHER("电子券支付",1,"7","/m/trade/pay.htm?trade.tradeNo=",1,"电子券支付","PAID",false),
	AFTERPAYMENT("到酒店前台现付",2,"1","",1,"到酒店前台现付","AFTERPAYMENT",false),
	ICBCPAY("工银E支付",1,"7","",2,"工银E支付","PAID",false),
    ICBCPAY2("工商银行预付",1,"7","",2,"工商银行预付","PAID",false),
    BOCPAY("中银支付",1,"7","",2,"中银支付","PAID",false),
    WAITPAY("预付未付", 1, "7", "",1,"预付未付","PAID",false);
    private String description;
    private int commonCode;     //1:预付,2:现付
    private String kwsCode;
    private String url;//去支付的url
    private int typeCode; //1:第一阶段,2:第二阶段
    private String pfsDesc;//批发商显示名字
    private String ebookingCode;
    private boolean showStatus;//活动编辑中是否显示

    TradePayWayEnum(String description, int commonCode, String kwsCode, String url, int typeCode, String pfsDesc, String ebookingCode, boolean showStatus) {
        this.description = description;
        this.commonCode = commonCode;
        this.kwsCode = kwsCode;
        this.url = url;
        this.typeCode = typeCode;
        this.pfsDesc = pfsDesc;
        this.ebookingCode = ebookingCode;
        this.showStatus = showStatus;
    }

    /**
     * ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓function↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*
     */





    //活动设置页显示支付渠道
    public static List<TradePayWayEnum> getActivityShow(){
        List<TradePayWayEnum> demoList = new ArrayList<TradePayWayEnum>();
        for (TradePayWayEnum tradePayWayEnum : TradePayWayEnum.getList()) {
            if (tradePayWayEnum.showStatus) {
                demoList.add(tradePayWayEnum);
            }
        }
        return demoList;
    }


    public static List<TradePayWayEnum> getList(){
        List<TradePayWayEnum> demoList = new ArrayList<TradePayWayEnum>();
        for(TradePayWayEnum demo : TradePayWayEnum.values()){
            demoList.add(demo);
        }
        return demoList;
    }

    //批发商专用排序
    public static List<TradePayWayEnum> getListOfPFC(){
        List<TradePayWayEnum> demoList = new ArrayList<TradePayWayEnum>();
        demoList.add(TradePayWayEnum.WEALTH);
        demoList.add(TradePayWayEnum.ALIPAY);
        demoList.add(TradePayWayEnum.WEIXIN);
        demoList.add(TradePayWayEnum.CARD);
        return demoList;
    }



    public static List<TradePayWayEnum> getListByCommonCode(int commonCode){
        List<TradePayWayEnum> demoList = new ArrayList<TradePayWayEnum>();
        for(TradePayWayEnum demo : TradePayWayEnum.values()) {
            if (demo.commonCode == commonCode) {
                demoList.add(demo);
            }
        }
        return demoList;
    }


    public boolean isShowStatus() {
        return showStatus;
    }

    public void setShowStatus(boolean showStatus) {
        this.showStatus = showStatus;
    }

    /**↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓set && get↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓**/



    /**
     * 枚举返回list
     * @return  List<Map<String,Object>>
     */
    public static List<Map<String,Object>> getListByMap(){
        List<Map<String,Object>> list = new ArrayList<>();
        for(TradePayWayEnum demo : TradePayWayEnum.values()){
            Map<String,Object> map = new HashMap<>();
            map.put("name",demo.getDescription());
            map.put("val",demo.getValue());
            list.add(map);
        }
        return list;
    }

    public String getKwsCode() {
        return kwsCode;
    }

    public void setKwsCode(String kwsCode) {
        this.kwsCode = kwsCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCommonCode() {
        return commonCode;
    }

    public void setCommonCode(int commonCode) {
        this.commonCode = commonCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getPfsDesc() {
        return pfsDesc;
    }

    public void setPfsDesc(String pfsDesc) {
        this.pfsDesc = pfsDesc;
    }
    public String getEbookingCode() {
        return ebookingCode;
    }

    public void setEbookingCode(String ebookingCode) {
        this.ebookingCode = ebookingCode;
    }

    @Override
    public Serializable getValue() {
        return this.name();
    }
}
