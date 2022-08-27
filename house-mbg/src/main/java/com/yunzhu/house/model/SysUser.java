package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName sys_user
 */
@TableName(value ="sys_user")
@Data
public class SysUser implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 微信openId
     */
    private String openid;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String headimgUrl;

    /**
     * 证件类型
     */
    private String certificatesType;

    /**
     * 证件编号
     */
    private String certificatesNo;

    /**
     * 证件路径
     */
    private String certificatesUrl;

    /**
     * 认证状态（0：未认证 1：认证中 2：认证成功 -1：认证失败）
     */
    private Integer authStatus;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 最后登录时间
     */
    private Date lastLogintime;

    /**
     * 密码
     */
    private String password;

    /**
     * 真是姓名
     */
    private String realName;

    /**
     * 角色
     */
    private Integer role;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 部门ID
     */
    private Long departmentid;

    /**
     * 部门名
     */
    private String departmentname;

    /**
     * 1级：数据可以跨部门，2级：数据仅限本部门，3级：房东
     */
    private String usergrade;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除(1:已删除，0:未删除)
     */
    private Integer isDeleted;

    /**
     * 状态（0：锁定 1：正常）
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}