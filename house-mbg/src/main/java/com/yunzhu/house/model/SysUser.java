package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUser implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "微信openId")
    private String openid;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "用户头像")
    private String headimgUrl;

    @ApiModelProperty(value = "证件类型")
    private String certificatesType;

    @ApiModelProperty(value = "证件编号")
    private String certificatesNo;

    @ApiModelProperty(value = "证件路径")
    private String certificatesUrl;

    @ApiModelProperty(value = "认证状态（0：未认证 1：认证中 2：认证成功 -1：认证失败）")
    private Integer authStatus;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "最后登录时间")
    private Date lastLogintime;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真是姓名")
    private String realName;

    @ApiModelProperty(value = "角色")
    private Integer role;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "部门ID")
    private Long departmentid;

    @ApiModelProperty(value = "部门名")
    private String departmentname;

    @ApiModelProperty(value = "1级：数据可以跨部门，2级：数据仅限本部门，3级：房东")
    private String usergrade;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除(1:已删除，0:未删除)")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty(value = "状态（0：锁定 1：正常）")
    private Integer status;

    private static final long serialVersionUID = 1L;

}