package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HousetypeHouse;
import com.yunzhu.house.model.HousetypeHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousetypeHouseMapper extends BaseMapper<HousetypeHouse> {
    long countByExample(HousetypeHouseExample example);

    int deleteByExample(HousetypeHouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HousetypeHouse row);

    int insertSelective(HousetypeHouse row);

    List<HousetypeHouse> selectByExample(HousetypeHouseExample example);

    HousetypeHouse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HousetypeHouse row, @Param("example") HousetypeHouseExample example);

    int updateByExample(@Param("row") HousetypeHouse row, @Param("example") HousetypeHouseExample example);

    int updateByPrimaryKeySelective(HousetypeHouse row);

    int updateByPrimaryKey(HousetypeHouse row);
}