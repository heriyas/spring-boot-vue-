package com.zouweihao.zouweihao.service.impl;


import com.zouweihao.zouweihao.dao.UserDao;
import com.zouweihao.zouweihao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements com.zouweihao.zouweihao.service.UserService {

    @Autowired
     private  UserDao userDao;

    public User getLogin(String user_id, String user_password){
        return userDao.getBy(user_id,user_password);
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    public boolean save(User user) {
             userDao.save(user);
             return true;
    }

    public User getUserId(Integer id){
        return userDao.getUserId(id);
    }

    public boolean update(User user) {
        userDao.update(user);
        return true;
    }

    public boolean delete(Integer id) {
        userDao.delete(id);
        return true;
    }

    public List<User> getUser_Id(String user_id){
        return userDao.getUser_Id(user_id);
    }


    // 下面是user_b表的操作

    public List<User> getAllUserB() {
        return userDao.getAllUserB();
    }


    public boolean saveB(User user) {
        userDao.saveB(user);
        return true;
    }


    public User getUserIdB(Integer id) {
        return userDao.getUserIdB(id);
    }


    public boolean updateB(User user) {
        userDao.updateB(user);
        return true;
    }


    public boolean deleteB(Integer id) {
        userDao.deleteB(id);
        return true;
    }

    @Override
    public List<User> getUser_IdB(String user_id) {
        return userDao.getUser_IdB(user_id);
    }


    public List<User> getAllAdmin() {
        return userDao.getAllAdmin();
    }


}
