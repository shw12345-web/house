package com.yunzhu.house.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 附件表
 * @TableName attachment
 */
@TableName(value ="attachment")
@Data
public class Attachment implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件地址
     */
    private String filePath;

    /**
     * 文件类型
     */
    private Integer fileType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}