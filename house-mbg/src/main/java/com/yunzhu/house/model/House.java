package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName house
 */
@TableName(value ="house")
@Data
public class House implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 房屋类型ID
     */
    private Long housetypeid;

    /**
     * 房屋类型名
     */
    private String housetypename;

    /**
     * 房屋地址
     */
    private String houseaddress;

    /**
     * 城市
     */
    private String housecity;

    /**
     * 楼层
     */
    private String housefloor;

    /**
     * 楼号
     */
    private String buildingnumber;

    /**
     * 期望租金
     */
    private BigDecimal expectedrent;

    /**
     * 房屋面积
     */
    private String housearea;

    /**
     * 房源类型 0-整租 1-合租
     */
    private String housetype;

    /**
     * 单元号
     */
    private String houseunit;

    /**
     * 门牌号
     */
    private String housenumber;

    /**
     * 房屋名称
     */
    private String housename;

    /**
     * 房屋描述
     */
    private String housedesc;

    /**
     * 房屋地图信息
     */
    private String housemaplocation;

    /**
     * 房屋二维码图片
     */
    private String housetwodimensionalcode;

    /**
     * 房屋照片
     */
    private String houseimage;

    /**
     * 房东ID
     */
    private Long houseownerid;

    /**
     * 房东姓名
     */
    private String houseownername;

    /**
     * 注册时间
     */
    private Date registdate;

    /**
     * 所属部门ID
     */
    private Long departmentid;

    /**
     * 所属部门名
     */
    private String departmentname;

    /**
     * 
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
     * 房源上下架状态 0-上架 1-下架
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}