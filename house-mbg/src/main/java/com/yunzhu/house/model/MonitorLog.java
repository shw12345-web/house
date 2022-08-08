package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getLogType() {
        return logType;
    }

    public void setLogType(Short logType) {
        this.logType = logType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Byte getDisarm() {
        return disarm;
    }

    public void setDisarm(Byte disarm) {
        this.disarm = disarm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logType=").append(logType);
        sb.append(", message=").append(message);
        sb.append(", objectId=").append(objectId);
        sb.append(", value=").append(value);
        sb.append(", disarm=").append(disarm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}