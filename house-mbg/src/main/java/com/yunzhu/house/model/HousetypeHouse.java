package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class HousetypeHouse implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房间类型")
    private Long housetypeid;

    @ApiModelProperty(value = "房屋ID")
    private Long houseid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHousetypeid() {
        return housetypeid;
    }

    public void setHousetypeid(Long housetypeid) {
        this.housetypeid = housetypeid;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", housetypeid=").append(housetypeid);
        sb.append(", houseid=").append(houseid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}