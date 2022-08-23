package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.HouseRoom;
import com.yunzhu.house.model.HouseRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseRoomMapper extends BaseMapper<HouseRoom> {
    long countByExample(HouseRoomExample example);

    int deleteByExample(HouseRoomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HouseRoom row);

    int insertSelective(HouseRoom row);

    List<HouseRoom> selectByExample(HouseRoomExample example);

    HouseRoom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") HouseRoom row, @Param("example") HouseRoomExample example);

    int updateByExample(@Param("row") HouseRoom row, @Param("example") HouseRoomExample example);

    int updateByPrimaryKeySelective(HouseRoom row);

    int updateByPrimaryKey(HouseRoom row);
}