package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 租客
 * @TableName tenant
 */
@TableName(value ="tenant")
@Data
public class Tenant implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String tenantname;

    /**
     * 身份证号
     */
    private String tenantidentify;

    /**
     * 电话
     */
    private String tenanttel;

    /**
     * 来源省
     */
    private String tenantfromshen;

    /**
     * 来源市
     */
    private String tenantfromshi;

    /**
     * 来源县
     */
    private String tenantfromxian;

    /**
     * 工作单位
     */
    private String tenantworkorganization;

    /**
     * 描述信息
     */
    private String tenantdesc;

    /**
     * 照片
     */
    private String tenantimage;

    /**
     * 审核内容
     */
    private String checkopion;

    /**
     * 审核者ID
     */
    private Long checkerid;

    /**
     * 审核者姓名
     */
    private String checkername;

    /**
     * 审核时间
     */
    private Date checkdate;

    /**
     * 
     */
    private String tenantcode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}