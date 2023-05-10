package com.zouweihao.zouweihao.controller;

import com.zouweihao.zouweihao.entity.Room;
import com.zouweihao.zouweihao.entity.User;
import com.zouweihao.zouweihao.service.HotelService;
import com.zouweihao.zouweihao.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService ;

    @GetMapping("/roomAjax_a")
    public Result getAll() {
        List<Room> userList = hotelService.getAllRoom();
        return  new Result(200, "成功",userList);

    }

    @PostMapping("/roomAdd_a")
    public Result save(@RequestBody Room room) {
        hotelService.save(room);
        System.out.println(room);
        return new Result(200,"OK");
    }

    @GetMapping("/roomSelect_a/{id}")
    public Result getRoomId(@PathVariable Integer id) {
       Room room =  hotelService.getRoomId(id);
        if (room != null) {
            return new Result(200,"成功",room);
        }else
            return new Result(400,"err");
    }

    @PutMapping("/roomUpdate_a")
    public Result update(@RequestBody Room room) {
        hotelService.update(room);
        return new Result(200,"OK");
    }

    @DeleteMapping("/roomDelete_a/{id}")
    public Result delete(@PathVariable  Integer id) {
        hotelService.delete(id);
        return new Result(200, "ok");
    }

    @GetMapping("/roomSelect_id_a/{user_id}")
    public Result getRoom_id(@PathVariable Integer id) {
        List<Room> roomList = hotelService.getRoom_Id(id);

        if (roomList != null) {
            return new Result(200,"成功",roomList);
        }else
            return new Result(400,"err");
    }
    //// hotel七天
    @GetMapping("/roomAjax_b")
    public Result getAllB() {
        List<Room> userList = hotelService.getAllRoomB();
        return  new Result(200, "成功",userList);

    }

    @PostMapping("/roomAdd_b")
    public Result saveB(@RequestBody Room room) {
        hotelService.saveB(room);
        System.out.println(room);
        return new Result(200,"OK");
    }

    @GetMapping("/roomSelect_b/{id}")
    public Result getRoomIdB(@PathVariable Integer id) {
        Room room =  hotelService.getRoomIdB(id);
        if (room != null) {
            return new Result(200,"成功",room);
        }else
            return new Result(400,"err");
    }

    @PutMapping("/roomUpdate_b")
    public Result updateB(@RequestBody Room room) {
        hotelService.updateB(room);
        return new Result(200,"OK");
    }

    @DeleteMapping("/roomDelete_b/{id}")
    public Result deleteB(@PathVariable  Integer id) {
        hotelService.deleteB(id);
        return new Result(200, "ok");
    }

    @GetMapping("/roomSelect_id_b/{user_id}")
    public Result getRoom_idB(@PathVariable Integer id) {
        List<Room> roomList = hotelService.getRoom_IdB(id);

        if (roomList != null) {
            return new Result(200,"成功",roomList);
        }else
            return new Result(400,"err");
    }


}
