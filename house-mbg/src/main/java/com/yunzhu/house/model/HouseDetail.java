package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName house_detail
 */
@TableName(value ="house_detail")
@Data
public class HouseDetail implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房屋资源ID
     */
    private Long houseid;

    /**
     * 朝向
     */
    private String orientation;

    /**
     * 户型
     */
    private String housetype;

    /**
     * 装修
     */
    private String renovation;

    /**
     * 房屋设施
     */
    private String housefacilities;

    /**
     * 付款方式
     */
    private String paymentmethod;

    /**
     * 租期
     */
    private String leaseterm;

    /**
     * 水费
     */
    private BigDecimal chargewater;

    /**
     * 电费
     */
    private BigDecimal electricityfees;

    /**
     * 房源简介
     */
    private String houseintroduction;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}