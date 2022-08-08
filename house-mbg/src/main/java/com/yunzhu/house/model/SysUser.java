package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    private Integer id;

    private String email;

    private Date lastLogintime;

    private String password;

    private String realName;

    private Short role;

    private String tel;

    private String userName;

    @ApiModelProperty(value = "部门ID")
    private Long departmentid;

    @ApiModelProperty(value = "部门名")
    private String departmentname;

    @ApiModelProperty(value = "1级：数据可以跨部门，2级：数据仅限本部门，3级：房东")
    private String usergrade;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Date lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Short getRole() {
        return role;
    }

    public void setRole(Short role) {
        this.role = role;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getUsergrade() {
        return usergrade;
    }

    public void setUsergrade(String usergrade) {
        this.usergrade = usergrade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", lastLogintime=").append(lastLogintime);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", role=").append(role);
        sb.append(", tel=").append(tel);
        sb.append(", userName=").append(userName);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", usergrade=").append(usergrade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}