package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class House implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房屋类型ID")
    private Long housetypeid;

    @ApiModelProperty(value = "房屋类型名")
    private String housetypename;

    @ApiModelProperty(value = "房屋地址")
    private String houseaddress;

    @ApiModelProperty(value = "城市")
    private String housecity;

    @ApiModelProperty(value = "楼层")
    private String housefloor;

    @ApiModelProperty(value = "楼号")
    private String buildingnumber;

    @ApiModelProperty(value = "期望租金")
    private BigDecimal expectedrent;

    @ApiModelProperty(value = "房屋面积")
    private String housearea;

    @ApiModelProperty(value = "房源类型 0-整租 1-合租")
    private String housetype;

    @ApiModelProperty(value = "单元号")
    private String houseunit;

    @ApiModelProperty(value = "门牌号")
    private String housenumber;

    @ApiModelProperty(value = "房屋名称")
    private String housename;

    @ApiModelProperty(value = "房屋描述")
    private String housedesc;

    @ApiModelProperty(value = "房屋地图信息")
    private String housemaplocation;

    @ApiModelProperty(value = "房屋二维码图片")
    private String housetwodimensionalcode;

    @ApiModelProperty(value = "房屋照片")
    private String houseimage;

    @ApiModelProperty(value = "房东ID")
    private Long houseownerid;

    @ApiModelProperty(value = "房东姓名")
    private String houseownername;

    @ApiModelProperty(value = "注册时间")
    private Date registdate;

    @ApiModelProperty(value = "所属部门ID")
    private Long departmentid;

    @ApiModelProperty(value = "所属部门名")
    private String departmentname;

    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    @ApiModelProperty(value = "房源上下架状态 0-上架 1-下架")
    private Byte status;

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

    public String getHousetypename() {
        return housetypename;
    }

    public void setHousetypename(String housetypename) {
        this.housetypename = housetypename;
    }

    public String getHouseaddress() {
        return houseaddress;
    }

    public void setHouseaddress(String houseaddress) {
        this.houseaddress = houseaddress;
    }

    public String getHousecity() {
        return housecity;
    }

    public void setHousecity(String housecity) {
        this.housecity = housecity;
    }

    public String getHousefloor() {
        return housefloor;
    }

    public void setHousefloor(String housefloor) {
        this.housefloor = housefloor;
    }

    public String getBuildingnumber() {
        return buildingnumber;
    }

    public void setBuildingnumber(String buildingnumber) {
        this.buildingnumber = buildingnumber;
    }

    public BigDecimal getExpectedrent() {
        return expectedrent;
    }

    public void setExpectedrent(BigDecimal expectedrent) {
        this.expectedrent = expectedrent;
    }

    public String getHousearea() {
        return housearea;
    }

    public void setHousearea(String housearea) {
        this.housearea = housearea;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getHouseunit() {
        return houseunit;
    }

    public void setHouseunit(String houseunit) {
        this.houseunit = houseunit;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getHousedesc() {
        return housedesc;
    }

    public void setHousedesc(String housedesc) {
        this.housedesc = housedesc;
    }

    public String getHousemaplocation() {
        return housemaplocation;
    }

    public void setHousemaplocation(String housemaplocation) {
        this.housemaplocation = housemaplocation;
    }

    public String getHousetwodimensionalcode() {
        return housetwodimensionalcode;
    }

    public void setHousetwodimensionalcode(String housetwodimensionalcode) {
        this.housetwodimensionalcode = housetwodimensionalcode;
    }

    public String getHouseimage() {
        return houseimage;
    }

    public void setHouseimage(String houseimage) {
        this.houseimage = houseimage;
    }

    public Long getHouseownerid() {
        return houseownerid;
    }

    public void setHouseownerid(Long houseownerid) {
        this.houseownerid = houseownerid;
    }

    public String getHouseownername() {
        return houseownername;
    }

    public void setHouseownername(String houseownername) {
        this.houseownername = houseownername;
    }

    public Date getRegistdate() {
        return registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", housetypeid=").append(housetypeid);
        sb.append(", housetypename=").append(housetypename);
        sb.append(", houseaddress=").append(houseaddress);
        sb.append(", housecity=").append(housecity);
        sb.append(", housefloor=").append(housefloor);
        sb.append(", buildingnumber=").append(buildingnumber);
        sb.append(", expectedrent=").append(expectedrent);
        sb.append(", housearea=").append(housearea);
        sb.append(", housetype=").append(housetype);
        sb.append(", houseunit=").append(houseunit);
        sb.append(", housenumber=").append(housenumber);
        sb.append(", housename=").append(housename);
        sb.append(", housedesc=").append(housedesc);
        sb.append(", housemaplocation=").append(housemaplocation);
        sb.append(", housetwodimensionalcode=").append(housetwodimensionalcode);
        sb.append(", houseimage=").append(houseimage);
        sb.append(", houseownerid=").append(houseownerid);
        sb.append(", houseownername=").append(houseownername);
        sb.append(", registdate=").append(registdate);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", checkopion=").append(checkopion);
        sb.append(", checkerid=").append(checkerid);
        sb.append(", checkername=").append(checkername);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}