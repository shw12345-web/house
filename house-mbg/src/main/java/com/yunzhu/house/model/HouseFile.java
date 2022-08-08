package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public String getPicturetype() {
        return picturetype;
    }

    public void setPicturetype(String picturetype) {
        this.picturetype = picturetype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", houseid=").append(houseid);
        sb.append(", picturetype=").append(picturetype);
        sb.append(", filename=").append(filename);
        sb.append(", fileurl=").append(fileurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}