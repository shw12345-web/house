package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName housetype_house
 */
@TableName(value ="housetype_house")
@Data
public class HousetypeHouse implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房间类型
     */
    private Long housetypeid;

    /**
     * 房屋ID
     */
    private Long houseid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}