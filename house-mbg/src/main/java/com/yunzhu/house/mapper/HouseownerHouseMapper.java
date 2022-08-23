package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HouseownerHouse;
import com.yunzhu.house.model.HouseownerHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseownerHouseMapper extends BaseMapper<HouseownerHouse> {
    long countByExample(HouseownerHouseExample example);

    int deleteByExample(HouseownerHouseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseownerHouse row);

    int insertSelective(HouseownerHouse row);

    List<HouseownerHouse> selectByExample(HouseownerHouseExample example);

    HouseownerHouse selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseownerHouse row, @Param("example") HouseownerHouseExample example);

    int updateByExample(@Param("row") HouseownerHouse row, @Param("example") HouseownerHouseExample example);

    int updateByPrimaryKeySelective(HouseownerHouse row);

    int updateByPrimaryKey(HouseownerHouse row);
}