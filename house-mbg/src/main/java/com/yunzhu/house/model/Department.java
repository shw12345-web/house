package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 区域
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 区域ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 区域名
     */
    private String name;

    /**
     * 区域经纬度
     */
    private String jwd;

    /**
     * 区域描述
     */
    private String remark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}