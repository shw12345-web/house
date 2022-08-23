package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Houseowner implements Serializable {
    private Long id;

    @ApiModelProperty(value = "登录账号")
    private String houseownercode;

    @ApiModelProperty(value = "登录密码")
    private String houseownerpassword;

    @ApiModelProperty(value = "姓名")
    private String houseownername;

    @ApiModelProperty(value = "身份证号")
    private String houseowneridentify;

    @ApiModelProperty(value = "电话")
    private String houseownertel;

    @ApiModelProperty(value = "描述信息")
    private String houseownerdesc;

    @ApiModelProperty(value = "住址")
    private String houseowneraddress;

    @ApiModelProperty(value = "角色类型")
    private Long houseownerrole;

    @ApiModelProperty(value = "最后一次登录")
    private Date houseownerlastlogintime;

    @ApiModelProperty(value = "注册时间")
    private Date registdate;

    @ApiModelProperty(value = "审核内容")
    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    @ApiModelProperty(value = "房主照片")
    private String houseownerimage;

    @ApiModelProperty(value = "房主二维码图片")
    private String houseownertwodimensionalcode;

    private static final long serialVersionUID = 1L;


}