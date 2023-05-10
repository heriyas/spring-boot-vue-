package com.zouweihao.zouweihao.service;

import com.zouweihao.zouweihao.entity.Room;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoomService {

    List<Room> getAllRoom();

    List<Room> getALLDanRen();

    List<Room> getALLBiaoZhun();

    List<Room> getALLShangWu();

    List<Room> getALLHaoHua();

    Room getCardById(Integer id);
}
