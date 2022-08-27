package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName role_authority
 */
@TableName(value ="role_authority")
@Data
public class RoleAuthority implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String authorityId;

    /**
     * 
     */
    private Integer role;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}