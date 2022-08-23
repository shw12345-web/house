package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class House implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房屋类型ID")
    private Long housetypeid;

    @ApiModelProperty(value = "房屋类型名")
    private String housetypename;

    @ApiModelProperty(value = "房屋地址")
    private String houseaddress;

    @ApiModelProperty(value = "城市")
    private String housecity;

    @ApiModelProperty(value = "楼层")
    private String housefloor;

    @ApiModelProperty(value = "楼号")
    private String buildingnumber;

    @ApiModelProperty(value = "期望租金")
    private BigDecimal expectedrent;

    @ApiModelProperty(value = "房屋面积")
    private String housearea;

    @ApiModelProperty(value = "房源类型 0-整租 1-合租")
    private String housetype;

    @ApiModelProperty(value = "单元号")
    private String houseunit;

    @ApiModelProperty(value = "门牌号")
    private String housenumber;

    @ApiModelProperty(value = "房屋名称")
    private String housename;

    @ApiModelProperty(value = "房屋描述")
    private String housedesc;

    @ApiModelProperty(value = "房屋地图信息")
    private String housemaplocation;

    @ApiModelProperty(value = "房屋二维码图片")
    private String housetwodimensionalcode;

    @ApiModelProperty(value = "房屋照片")
    private String houseimage;

    @ApiModelProperty(value = "房东ID")
    private Long houseownerid;

    @ApiModelProperty(value = "房东姓名")
    private String houseownername;

    @ApiModelProperty(value = "注册时间")
    private Date registdate;

    @ApiModelProperty(value = "所属部门ID")
    private Long departmentid;

    @ApiModelProperty(value = "所属部门名")
    private String departmentname;

    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    @ApiModelProperty(value = "房源上下架状态 0-上架 1-下架")
    private Byte status;

    private static final long serialVersionUID = 1L;

}