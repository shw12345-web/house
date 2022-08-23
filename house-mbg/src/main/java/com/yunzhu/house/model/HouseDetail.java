package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class HouseDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "房屋资源ID")
    private Long houseid;

    @ApiModelProperty(value = "朝向")
    private String orientation;

    @ApiModelProperty(value = "户型")
    private String housetype;

    @ApiModelProperty(value = "装修")
    private String renovation;

    @ApiModelProperty(value = "房屋设施")
    private String housefacilities;

    @ApiModelProperty(value = "付款方式")
    private String paymentmethod;

    @ApiModelProperty(value = "租期")
    private String leaseterm;

    @ApiModelProperty(value = "水费")
    private BigDecimal chargewater;

    @ApiModelProperty(value = "电费")
    private BigDecimal electricityfees;

    @ApiModelProperty(value = "房源简介")
    private String houseintroduction;

    private static final long serialVersionUID = 1L;

}