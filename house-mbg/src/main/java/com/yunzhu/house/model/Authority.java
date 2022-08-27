package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 权限管理
 * @TableName authority
 */
@TableName(value ="authority")
@Data
public class Authority implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 按钮显示项
     */
    private String buttons;

    /**
     * 可勾选的
     */
    private Integer checked;

    /**
     * 可伸展的
     */
    private Integer expanded;

    /**
     * 按钮样式
     */
    private String iconCls;

    /**
     * 是否是叶子项
     */
    private Integer leaf;

    /**
     * 菜单代号
     */
    private String menuCode;

    /**
     * 菜单配置参数
     */
    private String menuConfig;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父节点ID
     */
    private Long parentId;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 创建Tab的路径
     */
    private String url;

    /**
     * 菜单项说明
     */
    private String descinfo;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}