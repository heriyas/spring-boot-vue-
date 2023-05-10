package com.zouweihao.zouweihao.service.impl;

import com.zouweihao.zouweihao.dao.RoomDao;
import com.zouweihao.zouweihao.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements com.zouweihao.zouweihao.service.RoomService {

    @Autowired
    private RoomDao roomDao;


    public List<Room> getAllRoom(){return roomDao.getAllRoom(); }


    public List<Room> getALLDanRen() {
       return roomDao.getALLDanRen();
    }

    @Override
    public List<Room> getALLBiaoZhun() {
        return roomDao.getALLBiaoZhun();
    }

    @Override
    public List<Room> getALLShangWu() {
        return roomDao.getALLShangWu();
    }

    @Override
    public List<Room> getALLHaoHua() {
        return roomDao.getALLHaoHua();
    }

    @Override
    public Room getCardById(Integer id) {
        return roomDao.getCardById(id);
    }


}
