package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Data
public class HouseFile implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "房屋资源ID")
    private Long houseid;

    @ApiModelProperty(value = "图片类型")
    private String picturetype;

    @ApiModelProperty(value = "图片名称")
    private String filename;

    @ApiModelProperty(value = "图片地址")
    private String fileurl;

    private static final long serialVersionUID = 1L;


}