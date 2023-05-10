package com.zouweihao.zouweihao.dao;


import com.zouweihao.zouweihao.entity.Room;
import com.zouweihao.zouweihao.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HotelDao {

    @Select("select * from room_a ")
    List<Room> getAllRoom();

    @Insert("insert into room_a (room_number, room_price, room_status, room_style) values(#{room_number}, #{room_price}, #{room_status},#{room_style})")
    boolean save(Room room);

    @Select("select * from room_a where id = #{id}")
    Room getRoomId(Integer id);

    @Update("update room_a set room_number = #{room_number}, room_price = #{room_price}, room_status = #{room_status} where id = #{id}")
    boolean update(Room room);

    @Delete("delete from room_a where id = #{id}")
    boolean delete(Integer id);

    @Select("select * from room_a where room_number = #{room_number}")
    List<Room> getRoom_Id(Integer room_id);


    // 七天连锁
    @Select("select * from room_b ")
    List<Room> getAllRoomB();

    @Insert("insert into room_b (room_number, room_price, room_status, room_style) values(#{room_number}, #{room_price}, #{room_status},#{room_style})")
    boolean saveB(Room room);

    @Select("select * from room_b where id = #{id}")
    Room getRoomIdB(Integer id);

    @Update("update room_b set room_number = #{room_number}, room_price = #{room_price}, room_status = #{room_status} where id = #{id}")
    boolean updateB(Room room);

    @Delete("delete from room_b where id = #{id}")
    boolean deleteB(Integer id);

    @Select("select * from room_b where room_number = #{room_number}")
    List<Room> getRoom_IdB(Integer room_id);
}
