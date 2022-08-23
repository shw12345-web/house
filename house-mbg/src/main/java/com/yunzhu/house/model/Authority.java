package com.yunzhu.house.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Authority implements Serializable {
    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "按钮显示项")
    private String buttons;

    @ApiModelProperty(value = "可勾选的")
    private Integer checked;

    @ApiModelProperty(value = "可伸展的")
    private Integer expanded;

    @ApiModelProperty(value = "按钮样式")
    private String iconCls;

    @ApiModelProperty(value = "是否是叶子项")
    private Integer leaf;

    @ApiModelProperty(value = "菜单代号")
    private String menuCode;

    @ApiModelProperty(value = "菜单配置参数")
    private String menuConfig;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "父节点ID")
    private Long parentId;

    @ApiModelProperty(value = "排序")
    private Integer sortOrder;

    @ApiModelProperty(value = "创建Tab的路径")
    private String url;

    @ApiModelProperty(value = "菜单项说明")
    private String descinfo;

    private static final long serialVersionUID = 1L;


}