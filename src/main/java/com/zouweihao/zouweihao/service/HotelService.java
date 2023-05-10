package com.zouweihao.zouweihao.service;

import com.zouweihao.zouweihao.entity.Room;
import com.zouweihao.zouweihao.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface HotelService {

    List<Room> getAllRoom();

    boolean save(Room room);

    Room getRoomId(Integer id);

    boolean update(Room room);

    boolean delete(Integer id);

    List<Room> getRoom_Id(Integer room_id);



    List<Room> getAllRoomB();

    boolean saveB(Room room);


    Room getRoomIdB(Integer id);

    boolean updateB(Room room);

    boolean deleteB(Integer id);

    List<Room> getRoom_IdB(Integer room_id);
}
