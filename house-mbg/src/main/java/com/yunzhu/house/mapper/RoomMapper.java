package com.yunzhu.house.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzhu.house.model.Room;
import com.yunzhu.house.model.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper extends BaseMapper<Room> {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Room row);

    int insertSelective(Room row);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Room row, @Param("example") RoomExample example);

    int updateByExample(@Param("row") Room row, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room row);

    int updateByPrimaryKey(Room row);
}