package com.zouweihao.zouweihao.service.impl;

import com.zouweihao.zouweihao.dao.HotelDao;
import com.zouweihao.zouweihao.entity.Room;
import com.zouweihao.zouweihao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements com.zouweihao.zouweihao.service.HotelService {

    @Autowired
    private HotelDao hotelDao;


    public List<Room> getAllRoom() {
        return hotelDao.getAllRoom();
    }

    public boolean save(Room room) {
        hotelDao.save(room);
        return true;
    }

    public Room getRoomId(Integer id) {
        return hotelDao.getRoomId(id);
    }

    public boolean update(Room room) {
        hotelDao.update(room);
        return true;
    }

    public boolean delete(Integer id) {
        hotelDao.delete(id);
        return true;
    }

    public List<Room> getRoom_Id(Integer room_id) {
        return hotelDao.getRoom_Id(room_id);
    }



    public List<Room> getAllRoomB() {
        return hotelDao.getAllRoomB();
    }

    @Override
    public boolean saveB(Room room) {
        hotelDao.saveB(room);
        return true;
    }

    @Override
    public Room getRoomIdB(Integer id) {
        return hotelDao.getRoomIdB(id);
    }

    @Override
    public boolean updateB(Room room) {
        hotelDao.updateB(room);
        return true;
    }

    @Override
    public boolean deleteB(Integer id) {
        hotelDao.deleteB(id);
        return true;
    }

    @Override
    public List<Room> getRoom_IdB(Integer room_id) {
        return hotelDao.getRoom_IdB(room_id);
    }
}
