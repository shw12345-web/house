package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Housetype implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房屋类型")
    private String housetypename;

    @ApiModelProperty(value = "房屋描述")
    private String housetypedesc;

    private static final long serialVersionUID = 1L;

}