package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName houseowner_house
 */
@TableName(value ="houseowner_house")
@Data
public class HouseownerHouse implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long houseid;

    /**
     * 
     */
    private Long houseownerid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}