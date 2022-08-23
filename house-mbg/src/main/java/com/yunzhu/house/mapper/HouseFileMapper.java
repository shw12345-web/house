package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HouseFile;
import com.yunzhu.house.model.HouseFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseFileMapper extends BaseMapper<HouseFile> {
    long countByExample(HouseFileExample example);

    int deleteByExample(HouseFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseFile row);

    int insertSelective(HouseFile row);

    List<HouseFile> selectByExample(HouseFileExample example);

    HouseFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseFile row, @Param("example") HouseFileExample example);

    int updateByExample(@Param("row") HouseFile row, @Param("example") HouseFileExample example);

    int updateByPrimaryKeySelective(HouseFile row);

    int updateByPrimaryKey(HouseFile row);
}