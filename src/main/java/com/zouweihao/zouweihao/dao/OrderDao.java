package com.zouweihao.zouweihao.dao;

import com.zouweihao.zouweihao.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderDao {

    @Insert("insert into orders (form_intime, form_outtime, form_content, room_id, style, user_name) values(#{form_intime}, #{form_outtime}, #{form_content}, #{room_id}, #{style}, #{user_name})")
    boolean saveOrder(Order order);

    @Select("select * from orders where user_name = #{user_name}")
    List<Order> getMyOrder(String user_name);

}
