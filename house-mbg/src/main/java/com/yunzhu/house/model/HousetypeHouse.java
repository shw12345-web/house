package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class HousetypeHouse implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房间类型")
    private Long housetypeid;

    @ApiModelProperty(value = "房屋ID")
    private Long houseid;

    private static final long serialVersionUID = 1L;

}