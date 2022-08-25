package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class HouseOrder implements Serializable {
    private Long id;

    @ApiModelProperty(value = "房源ID")
    private Long houseid;

    @ApiModelProperty(value = "房源名称")
    private String housename;

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

    @ApiModelProperty(value = "订单数量")
    private Integer quantity;

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
}