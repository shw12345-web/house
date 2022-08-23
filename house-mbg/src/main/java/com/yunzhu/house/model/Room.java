package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Room implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房间名称")
    private String roomname;

    @ApiModelProperty(value = "房间面积")
    private String roomarea;

    @ApiModelProperty(value = "房间描述")
    private String roomdesc;

    @ApiModelProperty(value = "房间二维码照片")
    private String roomtwodimensionalcode;

    @ApiModelProperty(value = "房间照片")
    private String roomimage;

    @ApiModelProperty(value = "房屋ID")
    private Long houseid;

    @ApiModelProperty(value = "房屋名")
    private String housename;

    @ApiModelProperty(value = "审核内容")
    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    private Date registdate;

    private static final long serialVersionUID = 1L;

}