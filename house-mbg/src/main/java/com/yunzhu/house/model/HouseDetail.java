package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class HouseDetail implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "房屋资源ID")
    private Long houseid;

    @ApiModelProperty(value = "朝向")
    private String orientation;

    @ApiModelProperty(value = "户型")
    private String housetype;

    @ApiModelProperty(value = "装修")
    private String renovation;

    @ApiModelProperty(value = "房屋设施")
    private String housefacilities;

    @ApiModelProperty(value = "付款方式")
    private String paymentmethod;

    @ApiModelProperty(value = "租期")
    private String leaseterm;

    @ApiModelProperty(value = "水费")
    private BigDecimal chargewater;

    @ApiModelProperty(value = "电费")
    private BigDecimal electricityfees;

    @ApiModelProperty(value = "房源简介")
    private String houseintroduction;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHouseid() {
        return houseid;
    }

    public void setHouseid(Long houseid) {
        this.houseid = houseid;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getRenovation() {
        return renovation;
    }

    public void setRenovation(String renovation) {
        this.renovation = renovation;
    }

    public String getHousefacilities() {
        return housefacilities;
    }

    public void setHousefacilities(String housefacilities) {
        this.housefacilities = housefacilities;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getLeaseterm() {
        return leaseterm;
    }

    public void setLeaseterm(String leaseterm) {
        this.leaseterm = leaseterm;
    }

    public BigDecimal getChargewater() {
        return chargewater;
    }

    public void setChargewater(BigDecimal chargewater) {
        this.chargewater = chargewater;
    }

    public BigDecimal getElectricityfees() {
        return electricityfees;
    }

    public void setElectricityfees(BigDecimal electricityfees) {
        this.electricityfees = electricityfees;
    }

    public String getHouseintroduction() {
        return houseintroduction;
    }

    public void setHouseintroduction(String houseintroduction) {
        this.houseintroduction = houseintroduction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", houseid=").append(houseid);
        sb.append(", orientation=").append(orientation);
        sb.append(", housetype=").append(housetype);
        sb.append(", renovation=").append(renovation);
        sb.append(", housefacilities=").append(housefacilities);
        sb.append(", paymentmethod=").append(paymentmethod);
        sb.append(", leaseterm=").append(leaseterm);
        sb.append(", chargewater=").append(chargewater);
        sb.append(", electricityfees=").append(electricityfees);
        sb.append(", houseintroduction=").append(houseintroduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}