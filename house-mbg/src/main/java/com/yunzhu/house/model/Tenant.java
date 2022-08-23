package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Tenant implements Serializable {
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String tenantname;

    @ApiModelProperty(value = "身份证号")
    private String tenantidentify;

    @ApiModelProperty(value = "电话")
    private String tenanttel;

    @ApiModelProperty(value = "来源省")
    private String tenantfromshen;

    @ApiModelProperty(value = "来源市")
    private String tenantfromshi;

    @ApiModelProperty(value = "来源县")
    private String tenantfromxian;

    @ApiModelProperty(value = "工作单位")
    private String tenantworkorganization;

    @ApiModelProperty(value = "描述信息")
    private String tenantdesc;

    @ApiModelProperty(value = "照片")
    private String tenantimage;

    @ApiModelProperty(value = "审核内容")
    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    private String tenantcode;

    private static final long serialVersionUID = 1L;

}