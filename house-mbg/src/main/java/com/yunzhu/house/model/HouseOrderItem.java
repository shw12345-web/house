package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单明细表
 * @TableName house_order_item
 */
@TableName(value ="house_order_item")
@Data
public class HouseOrderItem implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单ID
     */
    private Long orderid;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 房源ID
     */
    private Long houseid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}