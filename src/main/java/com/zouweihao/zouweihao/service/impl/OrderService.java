package com.zouweihao.zouweihao.service.impl;


import com.zouweihao.zouweihao.dao.OrderDao;
import com.zouweihao.zouweihao.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements com.zouweihao.zouweihao.service.OrderService {

    @Autowired
    OrderDao orderDao;


    public boolean saveOrder(Order order) {
        orderDao.saveOrder(order);
        return true;
    }

    @Override
    public List<Order> getMyOrder(String user_name) {
        return orderDao.getMyOrder(user_name);
    }
}
