package com.yunzhu.house.mapper;

import com.yunzhu.house.model.House;
import com.yunzhu.house.model.HouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseMapper {
    long countByExample(HouseExample example);

    int deleteByExample(HouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(House row);

    int insertSelective(House row);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") House row, @Param("example") HouseExample example);

    int updateByExample(@Param("row") House row, @Param("example") HouseExample example);

    int updateByPrimaryKeySelective(House row);

    int updateByPrimaryKey(House row);
}