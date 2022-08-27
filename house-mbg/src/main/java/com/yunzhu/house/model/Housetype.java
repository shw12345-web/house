package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName housetype
 */
@TableName(value ="housetype")
@Data
public class Housetype implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房屋类型
     */
    private String housetypename;

    /**
     * 房屋描述
     */
    private String housetypedesc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}