package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 房源房东
 * @TableName houseowner
 */
@TableName(value ="houseowner")
@Data
public class Houseowner implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 登录账号
     */
    private String houseownercode;

    /**
     * 登录密码
     */
    private String houseownerpassword;

    /**
     * 姓名
     */
    private String houseownername;

    /**
     * 身份证号
     */
    private String houseowneridentify;

    /**
     * 电话
     */
    private String houseownertel;

    /**
     * 描述信息
     */
    private String houseownerdesc;

    /**
     * 住址
     */
    private String houseowneraddress;

    /**
     * 角色类型
     */
    private Long houseownerrole;

    /**
     * 最后一次登录
     */
    private Date houseownerlastlogintime;

    /**
     * 注册时间
     */
    private Date registdate;

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
     * 房主照片
     */
    private String houseownerimage;

    /**
     * 房主二维码图片
     */
    private String houseownertwodimensionalcode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}