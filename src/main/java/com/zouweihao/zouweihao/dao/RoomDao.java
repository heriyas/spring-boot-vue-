package com.zouweihao.zouweihao.dao;


import com.zouweihao.zouweihao.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoomDao {

    @Select("select * from room_a")
    List<Room> getAllRoom();

    @Select("select * from room_a where room_style = '经济舒适单人间'")
    List<Room> getALLDanRen();

    @Select("select * from room_a where room_style = '普通标准间'")
    List<Room> getALLBiaoZhun();

    @Select("select * from room_a where room_style = '商务双床房'")
    List<Room> getALLShangWu();

    @Select("select * from room_a where room_style = '豪华总统房'")
    List<Room> getALLHaoHua();

    @Select("select * from room_a where id = #{id}")
    Room getCardById(Integer id);

}
