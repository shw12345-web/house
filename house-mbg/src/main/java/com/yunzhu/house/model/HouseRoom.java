package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class HouseRoom implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "房源ID")
    private Integer houseid;

    @ApiModelProperty(value = "房间ID")
    private Integer roomid;

    private static final long serialVersionUID = 1L;
}