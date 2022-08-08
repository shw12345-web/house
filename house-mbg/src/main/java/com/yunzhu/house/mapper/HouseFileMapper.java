package com.yunzhu.house.mapper;

import com.yunzhu.house.model.HouseFile;
import com.yunzhu.house.model.HouseFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseFileMapper {
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