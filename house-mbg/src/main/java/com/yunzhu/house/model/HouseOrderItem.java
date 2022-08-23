package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class HouseOrderItem implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private Long orderid;

    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    @ApiModelProperty(value = "房源ID")
    private Long houseid;

    private static final long serialVersionUID = 1L;

}