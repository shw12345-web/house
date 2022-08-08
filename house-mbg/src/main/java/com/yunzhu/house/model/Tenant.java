package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Tenant implements Serializable {
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String tenantname;

    @ApiModelProperty(value = "身份证号")
    private String tenantidentify;

    @ApiModelProperty(value = "电话")
    private String tenanttel;

    @ApiModelProperty(value = "来源省")
    private String tenantfromshen;

    @ApiModelProperty(value = "来源市")
    private String tenantfromshi;

    @ApiModelProperty(value = "来源县")
    private String tenantfromxian;

    @ApiModelProperty(value = "工作单位")
    private String tenantworkorganization;

    @ApiModelProperty(value = "描述信息")
    private String tenantdesc;

    @ApiModelProperty(value = "照片")
    private String tenantimage;

    @ApiModelProperty(value = "审核内容")
    private String checkopion;

    @ApiModelProperty(value = "审核者ID")
    private Long checkerid;

    @ApiModelProperty(value = "审核者姓名")
    private String checkername;

    @ApiModelProperty(value = "审核时间")
    private Date checkdate;

    private String tenantcode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantname() {
        return tenantname;
    }

    public void setTenantname(String tenantname) {
        this.tenantname = tenantname;
    }

    public String getTenantidentify() {
        return tenantidentify;
    }

    public void setTenantidentify(String tenantidentify) {
        this.tenantidentify = tenantidentify;
    }

    public String getTenanttel() {
        return tenanttel;
    }

    public void setTenanttel(String tenanttel) {
        this.tenanttel = tenanttel;
    }

    public String getTenantfromshen() {
        return tenantfromshen;
    }

    public void setTenantfromshen(String tenantfromshen) {
        this.tenantfromshen = tenantfromshen;
    }

    public String getTenantfromshi() {
        return tenantfromshi;
    }

    public void setTenantfromshi(String tenantfromshi) {
        this.tenantfromshi = tenantfromshi;
    }

    public String getTenantfromxian() {
        return tenantfromxian;
    }

    public void setTenantfromxian(String tenantfromxian) {
        this.tenantfromxian = tenantfromxian;
    }

    public String getTenantworkorganization() {
        return tenantworkorganization;
    }

    public void setTenantworkorganization(String tenantworkorganization) {
        this.tenantworkorganization = tenantworkorganization;
    }

    public String getTenantdesc() {
        return tenantdesc;
    }

    public void setTenantdesc(String tenantdesc) {
        this.tenantdesc = tenantdesc;
    }

    public String getTenantimage() {
        return tenantimage;
    }

    public void setTenantimage(String tenantimage) {
        this.tenantimage = tenantimage;
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

    public String getTenantcode() {
        return tenantcode;
    }

    public void setTenantcode(String tenantcode) {
        this.tenantcode = tenantcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tenantname=").append(tenantname);
        sb.append(", tenantidentify=").append(tenantidentify);
        sb.append(", tenanttel=").append(tenanttel);
        sb.append(", tenantfromshen=").append(tenantfromshen);
        sb.append(", tenantfromshi=").append(tenantfromshi);
        sb.append(", tenantfromxian=").append(tenantfromxian);
        sb.append(", tenantworkorganization=").append(tenantworkorganization);
        sb.append(", tenantdesc=").append(tenantdesc);
        sb.append(", tenantimage=").append(tenantimage);
        sb.append(", checkopion=").append(checkopion);
        sb.append(", checkerid=").append(checkerid);
        sb.append(", checkername=").append(checkername);
        sb.append(", checkdate=").append(checkdate);
        sb.append(", tenantcode=").append(tenantcode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}