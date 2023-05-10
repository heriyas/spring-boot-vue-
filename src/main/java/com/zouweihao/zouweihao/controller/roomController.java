package com.zouweihao.zouweihao.controller;


import com.zouweihao.zouweihao.entity.Room;

import com.zouweihao.zouweihao.entity.User;
import com.zouweihao.zouweihao.service.RoomService;
import com.zouweihao.zouweihao.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class roomController {
    @Autowired
    private RoomService roomService ;

    @GetMapping("/asideGetAll")
    public Result getAll() {
        System.out.println("所有");
        List<Room> roomList = roomService.getAllRoom();
        return  new Result(200, "成功",roomList);

    }

    @GetMapping("/asideDanRen")
    public Result getAllDanRen() {
        System.out.println("单人间");
        List<Room> roomList = roomService.getALLDanRen();
        return  new Result(200, "成功",roomList);

    }

    @GetMapping("/asideBiaoZhun")
    public Result getAllBiaoZhun() {
        System.out.println("标准间");
        List<Room> roomList = roomService.getALLBiaoZhun();
        return  new Result(200, "成功",roomList);

    }

    @GetMapping("/asideShangWu")
    public Result getAllShangWu() {
        System.out.println("商务间");
        List<Room> roomList = roomService.getALLShangWu();
        return  new Result(200, "成功",roomList);

    }

    @GetMapping("/asideHaoHua")
    public Result getAllHaoHua() {
        System.out.println("豪华间");
        List<Room> roomList = roomService.getALLHaoHua();
        return  new Result(200, "成功",roomList);

    }
    @GetMapping("/getCard/{id}")
    public Result getCard(@PathVariable Integer id) {
        System.out.println("卡片");
        Room card = roomService.getCardById(id);
        return  new Result(200, "成功",card);

    }




}
