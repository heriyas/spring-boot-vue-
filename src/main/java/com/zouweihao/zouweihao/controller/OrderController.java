package com.zouweihao.zouweihao.controller;

import com.zouweihao.zouweihao.entity.Comment;
import com.zouweihao.zouweihao.entity.Order;
import com.zouweihao.zouweihao.service.OrderService;
import com.zouweihao.zouweihao.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class OrderController {
        @Autowired OrderService orderService;

    @PostMapping("/orderAdd")
    public Result form(@RequestBody Order order) {
        orderService.saveOrder(order);
        return new Result(200,"OK");
    }

    @GetMapping("/getMyOrder/{user_name}")
    public Result getMyOrder(@PathVariable String user_name){
         List<Order>  orderList =  orderService.getMyOrder(user_name);
        System.out.println(orderList);
        return new Result(200,"ok", orderList);
    }

}
