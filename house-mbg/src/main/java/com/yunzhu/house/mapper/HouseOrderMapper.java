package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HouseOrder;
import com.yunzhu.house.model.HouseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseOrderMapper extends BaseMapper<HouseOrder> {
    long countByExample(HouseOrderExample example);

    int deleteByExample(HouseOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseOrder row);

    int insertSelective(HouseOrder row);

    List<HouseOrder> selectByExample(HouseOrderExample example);

    HouseOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseOrder row, @Param("example") HouseOrderExample example);

    int updateByExample(@Param("row") HouseOrder row, @Param("example") HouseOrderExample example);

    int updateByPrimaryKeySelective(HouseOrder row);

    int updateByPrimaryKey(HouseOrder row);
}