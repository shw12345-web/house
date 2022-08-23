package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Attachment;
import com.yunzhu.house.model.AttachmentExample;
import java.util.List;

import com.yunzhu.house.model.SysUser;
import org.apache.ibatis.annotations.Param;

public interface AttachmentMapper extends BaseMapper<Attachment> {
    long countByExample(AttachmentExample example);

    int deleteByExample(AttachmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Attachment row);

    int insertSelective(Attachment row);

    List<Attachment> selectByExample(AttachmentExample example);

    Attachment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Attachment row, @Param("example") AttachmentExample example);

    int updateByExample(@Param("row") Attachment row, @Param("example") AttachmentExample example);

    int updateByPrimaryKeySelective(Attachment row);

    int updateByPrimaryKey(Attachment row);
}