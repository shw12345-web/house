package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName house_room
 */
@TableName(value ="house_room")
@Data
public class HouseRoom implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房源ID
     */
    private Integer houseid;

    /**
     * 房间ID
     */
    private Integer roomid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}