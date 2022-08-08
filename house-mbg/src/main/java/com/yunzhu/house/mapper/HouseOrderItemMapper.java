package com.yunzhu.house.mapper;

import com.yunzhu.house.model.HouseOrderItem;
import com.yunzhu.house.model.HouseOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseOrderItemMapper {
    long countByExample(HouseOrderItemExample example);

    int deleteByExample(HouseOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseOrderItem row);

    int insertSelective(HouseOrderItem row);

    List<HouseOrderItem> selectByExample(HouseOrderItemExample example);

    HouseOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseOrderItem row, @Param("example") HouseOrderItemExample example);

    int updateByExample(@Param("row") HouseOrderItem row, @Param("example") HouseOrderItemExample example);

    int updateByPrimaryKeySelective(HouseOrderItem row);

    int updateByPrimaryKey(HouseOrderItem row);
}