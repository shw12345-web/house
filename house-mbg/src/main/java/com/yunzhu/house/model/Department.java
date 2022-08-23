package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Department implements Serializable {
    @ApiModelProperty(value = "区域ID")
    private Long id;

    @ApiModelProperty(value = "区域名")
    private String name;

    @ApiModelProperty(value = "区域经纬度")
    private String jwd;

    @ApiModelProperty(value = "区域描述")
    private String remark;

    private static final long serialVersionUID = 1L;


}