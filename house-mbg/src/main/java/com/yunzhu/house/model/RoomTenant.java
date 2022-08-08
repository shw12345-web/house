package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getTenantname() {
        return tenantname;
    }

    public void setTenantname(String tenantname) {
        this.tenantname = tenantname;
    }

    public String getDescinfo() {
        return descinfo;
    }

    public void setDescinfo(String descinfo) {
        this.descinfo = descinfo;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getCheckopion() {
        return checkopion;
    }

    public void setCheckopion(String checkopion) {
        this.checkopion = checkopion;
    }

    public Long getCheckerid() {
        return checkerid;
    }

    public void setCheckerid(Long checkerid) {
        this.checkerid = checkerid;
    }

    public String getCheckername() {
        return checkername;
    }

    public void setCheckername(String checkername) {
        this.checkername = checkername;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getIshistory() {
        return ishistory;
    }

    public void setIshistory(String ishistory) {
        this.ishistory = ishistory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roomid=").append(roomid);
        sb.append(", roomname=").append(roomname);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", tenantname=").append(tenantname);
        sb.append(", descinfo=").append(descinfo);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", checkopion=").append(checkopion);
        sb.append(", checkerid=").append(checkerid);
        sb.append(", checkername=").append(checkername);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", ishistory=").append(ishistory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}