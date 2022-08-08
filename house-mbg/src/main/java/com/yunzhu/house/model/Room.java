package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomarea() {
        return roomarea;
    }

    public void setRoomarea(String roomarea) {
        this.roomarea = roomarea;
    }

    public String getRoomdesc() {
        return roomdesc;
    }

    public void setRoomdesc(String roomdesc) {
        this.roomdesc = roomdesc;
    }

    public String getRoomtwodimensionalcode() {
        return roomtwodimensionalcode;
    }

    public void setRoomtwodimensionalcode(String roomtwodimensionalcode) {
        this.roomtwodimensionalcode = roomtwodimensionalcode;
    }

    public String getRoomimage() {
        return roomimage;
    }

    public void setRoomimage(String roomimage) {
        this.roomimage = roomimage;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
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

    public Date getRegistdate() {
        return registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roomname=").append(roomname);
        sb.append(", roomarea=").append(roomarea);
        sb.append(", roomdesc=").append(roomdesc);
        sb.append(", roomtwodimensionalcode=").append(roomtwodimensionalcode);
        sb.append(", roomimage=").append(roomimage);
        sb.append(", houseid=").append(houseid);
        sb.append(", housename=").append(housename);
        sb.append(", checkopion=").append(checkopion);
        sb.append(", checkerid=").append(checkerid);
        sb.append(", checkername=").append(checkername);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", registdate=").append(registdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}