package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Houseowner implements Serializable {
    private Long id;

    @ApiModelProperty(value = "登录账号")
    private String houseownercode;

    @ApiModelProperty(value = "登录密码")
    private String houseownerpassword;

    @ApiModelProperty(value = "姓名")
    private String houseownername;

    @ApiModelProperty(value = "身份证号")
    private String houseowneridentify;

    @ApiModelProperty(value = "电话")
    private String houseownertel;

    @ApiModelProperty(value = "描述信息")
    private String houseownerdesc;

    @ApiModelProperty(value = "住址")
    private String houseowneraddress;

    @ApiModelProperty(value = "角色类型")
    private Long houseownerrole;

    @ApiModelProperty(value = "最后一次登录")
    private Date houseownerlastlogintime;

    @ApiModelProperty(value = "注册时间")
    private Date registdate;

    @ApiModelProperty(value = "审核内容")
    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    @ApiModelProperty(value = "房主照片")
    private String houseownerimage;

    @ApiModelProperty(value = "房主二维码图片")
    private String houseownertwodimensionalcode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseownercode() {
        return houseownercode;
    }

    public void setHouseownercode(String houseownercode) {
        this.houseownercode = houseownercode;
    }

    public String getHouseownerpassword() {
        return houseownerpassword;
    }

    public void setHouseownerpassword(String houseownerpassword) {
        this.houseownerpassword = houseownerpassword;
    }

    public String getHouseownername() {
        return houseownername;
    }

    public void setHouseownername(String houseownername) {
        this.houseownername = houseownername;
    }

    public String getHouseowneridentify() {
        return houseowneridentify;
    }

    public void setHouseowneridentify(String houseowneridentify) {
        this.houseowneridentify = houseowneridentify;
    }

    public String getHouseownertel() {
        return houseownertel;
    }

    public void setHouseownertel(String houseownertel) {
        this.houseownertel = houseownertel;
    }

    public String getHouseownerdesc() {
        return houseownerdesc;
    }

    public void setHouseownerdesc(String houseownerdesc) {
        this.houseownerdesc = houseownerdesc;
    }

    public String getHouseowneraddress() {
        return houseowneraddress;
    }

    public void setHouseowneraddress(String houseowneraddress) {
        this.houseowneraddress = houseowneraddress;
    }

    public Long getHouseownerrole() {
        return houseownerrole;
    }

    public void setHouseownerrole(Long houseownerrole) {
        this.houseownerrole = houseownerrole;
    }

    public Date getHouseownerlastlogintime() {
        return houseownerlastlogintime;
    }

    public void setHouseownerlastlogintime(Date houseownerlastlogintime) {
        this.houseownerlastlogintime = houseownerlastlogintime;
    }

    public Date getRegistdate() {
        return registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
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

    public String getHouseownerimage() {
        return houseownerimage;
    }

    public void setHouseownerimage(String houseownerimage) {
        this.houseownerimage = houseownerimage;
    }

    public String getHouseownertwodimensionalcode() {
        return houseownertwodimensionalcode;
    }

    public void setHouseownertwodimensionalcode(String houseownertwodimensionalcode) {
        this.houseownertwodimensionalcode = houseownertwodimensionalcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", houseownercode=").append(houseownercode);
        sb.append(", houseownerpassword=").append(houseownerpassword);
        sb.append(", houseownername=").append(houseownername);
        sb.append(", houseowneridentify=").append(houseowneridentify);
        sb.append(", houseownertel=").append(houseownertel);
        sb.append(", houseownerdesc=").append(houseownerdesc);
        sb.append(", houseowneraddress=").append(houseowneraddress);
        sb.append(", houseownerrole=").append(houseownerrole);
        sb.append(", houseownerlastlogintime=").append(houseownerlastlogintime);
        sb.append(", registdate=").append(registdate);
        sb.append(", checkopion=").append(checkopion);
        sb.append(", checkerid=").append(checkerid);
        sb.append(", checkername=").append(checkername);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", houseownerimage=").append(houseownerimage);
        sb.append(", houseownertwodimensionalcode=").append(houseownertwodimensionalcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}