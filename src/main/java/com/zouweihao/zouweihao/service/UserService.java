package com.zouweihao.zouweihao.service;

import com.zouweihao.zouweihao.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {
    User getLogin(String user_id, String user_password);

    List<User> getAllUser();

    boolean save(User user);

    User getUserId(Integer id);

    boolean update(User user);

    boolean delete(Integer id);

    List<User> getUser_Id(String user_id);



    List<User> getAllUserB();

    boolean saveB(User user);

    User getUserIdB(Integer id);

    boolean updateB(User user);

    boolean deleteB(Integer id);

    List<User> getUser_IdB(String user_id);



    List<User> getAllAdmin();


}
