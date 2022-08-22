package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/22 8:57
 */
public class Housetype implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房屋类型")
    private String housetypename;

    @ApiModelProperty(value = "房屋描述")
    private String housetypedesc;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHousetypename() {
        return housetypename;
    }

    public void setHousetypename(String housetypename) {
        this.housetypename = housetypename;
    }

    public String getHousetypedesc() {
        return housetypedesc;
    }

    public void setHousetypedesc(String housetypedesc) {
        this.housetypedesc = housetypedesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", housetypename=").append(housetypename);
        sb.append(", housetypedesc=").append(housetypedesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}