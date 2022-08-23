package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoomTenant implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房间ID")
    private Long roomid;

    @ApiModelProperty(value = "房间名称")
    private String roomname;

    @ApiModelProperty(value = "租客ID")
    private Long tenantid;

    @ApiModelProperty(value = "租客名")
    private String tenantname;

    @ApiModelProperty(value = "描述信息")
    private String descinfo;

    @ApiModelProperty(value = "起始时间")
    private Date startdate;

    @ApiModelProperty(value = "结束时间")
    private Date enddate;

    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    @ApiModelProperty(value = "yes：已退租，no：没退租")
    private String ishistory;

    private static final long serialVersionUID = 1L;

}