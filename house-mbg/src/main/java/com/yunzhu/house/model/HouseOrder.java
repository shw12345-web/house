package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseOrder implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房源ID")
    private Long houseid;

    @ApiModelProperty(value = "租客ID")
    private Long tenantid;

    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "租期开始时间")
    private Date orderstart;

    @ApiModelProperty(value = "租期结束时间")
    private Date orderend;

    @ApiModelProperty(value = "支付开始时间")
    private Date paystart;

    @ApiModelProperty(value = "支付结束时间")
    private Date payend;

    @ApiModelProperty(value = "租金总金额")
    private BigDecimal renttotal;

    @ApiModelProperty(value = "提交时间")
    private Date createTime;

    @ApiModelProperty(value = "用户帐号")
    private String memberUsername;

    @ApiModelProperty(value = "订单租金")
    private BigDecimal amount;

    @ApiModelProperty(value = "支付方式：0->季付；1->半年付；2->年付")
    private Integer payType;

    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "支付时间")
    private Date paymentTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

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

    public Long getTenantid() {
        return tenantid;
    }

    public void setTenantid(Long tenantid) {
        this.tenantid = tenantid;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getOrderstart() {
        return orderstart;
    }

    public void setOrderstart(Date orderstart) {
        this.orderstart = orderstart;
    }

    public Date getOrderend() {
        return orderend;
    }

    public void setOrderend(Date orderend) {
        this.orderend = orderend;
    }

    public Date getPaystart() {
        return paystart;
    }

    public void setPaystart(Date paystart) {
        this.paystart = paystart;
    }

    public Date getPayend() {
        return payend;
    }

    public void setPayend(Date payend) {
        this.payend = payend;
    }

    public BigDecimal getRenttotal() {
        return renttotal;
    }

    public void setRenttotal(BigDecimal renttotal) {
        this.renttotal = renttotal;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", houseid=").append(houseid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", title=").append(title);
        sb.append(", orderstart=").append(orderstart);
        sb.append(", orderend=").append(orderend);
        sb.append(", paystart=").append(paystart);
        sb.append(", payend=").append(payend);
        sb.append(", renttotal=").append(renttotal);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", amount=").append(amount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", status=").append(status);
        sb.append(", orderType=").append(orderType);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}