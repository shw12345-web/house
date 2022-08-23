package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class MonitorLog implements Serializable {
    private Long id;

    @ApiModelProperty(value = "日志类型")
    private Short logType;

    @ApiModelProperty(value = "日志描述")
    private String message;

    @ApiModelProperty(value = "对象ID")
    private Integer objectId;

    @ApiModelProperty(value = "失联时间，单位为毫秒")
    private Double value;

    @ApiModelProperty(value = "是否解除警报")
    private Byte disarm;

    private static final long serialVersionUID = 1L;

}