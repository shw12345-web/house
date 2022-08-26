package com.yunzhu.house.dto.other;


import com.yunzhu.house.dto.enums.TradePayWayEnum;

/**
 * 付款方式
 *
 */
public class PayWay {

    /** 付款方式 **/
    private TradePayWayEnum tradePayWayEnum;

    public TradePayWayEnum getTradePayWayEnum() {
        return tradePayWayEnum;
    }

    public void setTradePayWayEnum(TradePayWayEnum tradePayWayEnum) {
        this.tradePayWayEnum = tradePayWayEnum;
    }
}
