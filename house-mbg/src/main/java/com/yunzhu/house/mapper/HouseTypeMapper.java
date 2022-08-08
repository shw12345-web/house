package com.yunzhu.house.mapper;

import com.yunzhu.house.model.HouseType;
import com.yunzhu.house.model.HouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseTypeMapper {
    long countByExample(HouseTypeExample example);

    int deleteByExample(HouseTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseType row);

    int insertSelective(HouseType row);

    List<HouseType> selectByExample(HouseTypeExample example);

    HouseType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseType row, @Param("example") HouseTypeExample example);

    int updateByExample(@Param("row") HouseType row, @Param("example") HouseTypeExample example);

    int updateByPrimaryKeySelective(HouseType row);

    int updateByPrimaryKey(HouseType row);
}