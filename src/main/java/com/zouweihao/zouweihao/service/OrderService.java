package com.zouweihao.zouweihao.service;

import com.zouweihao.zouweihao.entity.Order;

import java.util.List;

public interface OrderService {


    boolean saveOrder(Order order);

    List<Order> getMyOrder(String user_name);
}
