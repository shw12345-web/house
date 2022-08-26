package com.yunzhu.house.dto.other;

import java.io.Serializable;

/**
 * Created by yb on 2016/6/20.
 */
public class PointsComment  implements Serializable {

    private String channel;

    private String type;

    private String detail;

    private String comment;

    private String pointsType;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPointsType() {
        return pointsType;
    }

    public void setPointsType(String pointsType) {
        this.pointsType = pointsType;
    }

    @Override
    public String toString() {
        return "PointsComment{" +
                "channel='" + channel + '\'' +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", comment='" + comment + '\'' +
                ", pointsType='" + pointsType + '\'' +
                '}';
    }
}
