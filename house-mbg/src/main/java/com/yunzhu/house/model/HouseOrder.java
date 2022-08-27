package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表
 * @TableName house_order
 */
@TableName(value ="house_order")
@Data
public class HouseOrder implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房源ID
     */
    private Long houseid;

    /**
     * 房源名称
     */
    private String houseName;

    /**
     * 租客ID
     */
    private Long tenantid;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 标题
     */
    private String title;

    /**
     * 租期开始时间
     */
    private Date orderstart;

    /**
     * 租期结束时间
     */
    private Date orderend;

    /**
     * 支付开始时间
     */
    private Date paystart;

    /**
     * 支付结束时间
     */
    private Date payend;

    /**
     * 租金总金额
     */
    private BigDecimal renttotal;

    /**
     * 提交时间
     */
    private Date createTime;

    /**
     * 用户帐号
     */
    private String memberUsername;

    /**
     * 订单租金
     */
    private BigDecimal amount;

    /**
     * 支付方式：0->季付；1->半年付；2->年付
     */
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    private Integer orderType;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    private Integer deleteStatus;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 数量
     */
    private  Integer quantity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public String getOrderDesc() {
        StringBuffer sb = new StringBuffer();
        sb.append(orderNo);
        return sb.toString();
    }
}