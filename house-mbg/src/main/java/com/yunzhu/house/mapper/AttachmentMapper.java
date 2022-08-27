package com.yunzhu.house.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Attachment;

/**
* @author DELL
* @description 针对表【attachment(附件表)】的数据库操作Mapper
* @createDate 2022-08-27 11:40:52
* @Entity generator.pojo.Attachment
*/
public interface AttachmentMapper extends BaseMapper<Attachment> {

    Attachment selectOneById(@Param("id") Long id);

    List<Attachment> selectAllById(@Param("id") Long id);

    
    int delById(@Param("id") Long id);
}




