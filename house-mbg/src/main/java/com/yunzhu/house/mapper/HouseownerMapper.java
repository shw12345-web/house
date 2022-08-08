package com.yunzhu.house.mapper;

import com.yunzhu.house.model.Houseowner;
import com.yunzhu.house.model.HouseownerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseownerMapper {
    long countByExample(HouseownerExample example);

    int deleteByExample(HouseownerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Houseowner row);

    int insertSelective(Houseowner row);

    List<Houseowner> selectByExample(HouseownerExample example);

    Houseowner selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Houseowner row, @Param("example") HouseownerExample example);

    int updateByExample(@Param("row") Houseowner row, @Param("example") HouseownerExample example);

    int updateByPrimaryKeySelective(Houseowner row);

    int updateByPrimaryKey(Houseowner row);
}