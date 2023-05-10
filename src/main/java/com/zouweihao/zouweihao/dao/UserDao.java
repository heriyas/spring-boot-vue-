package com.zouweihao.zouweihao.dao;

import com.zouweihao.zouweihao.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM (SELECT * FROM user_a WHERE user_id = #{user_id} AND user_password = #{user_password} UNION  SELECT * FROM user_b WHERE user_id = #{user_id} AND user_password = #{user_password}) AS combined_tables")
    User getBy(String user_id, String user_password);

    @Select("select * from user_a where user_role='User' or 'superUser' ")
    List<User> getAllUser();

    @Insert("insert into user_a (user_name, user_id, user_password,user_role) values(#{user_name}, #{user_id}, #{user_password},#{user_role})")
    boolean save(User user);

    @Select("select * from user_a where id = #{id}")
    User getUserId(Integer id);

    @Update("update user_a set user_name = #{user_name}, user_id = #{user_id}, user_password = #{user_password} where id = #{id}")
    boolean update(User user);

    @Delete("delete from user_a where id = #{id}")
    boolean delete(Integer id);

    @Select("select * from user_a where user_id = #{user_id}")
    List<User> getUser_Id(String user_id);

//    @Update("update user_a set user_logintime = #{login_time}  where user_name = #{user_name}")
//    boolean updateTime(String login_time, String user_name);
//
//    @Select("select * from user_a where id=#{user_id}")
//    List<User> getByRole(Integer user_id);

    @Select("select * from user_b where user_role='User' or 'superUser' ")
    List<User> getAllUserB();

    @Insert("insert into user_b (user_name, user_id, user_password,user_role) values(#{user_name}, #{user_id}, #{user_password},#{user_role})")
    boolean saveB(User user);

    @Select("select * from user_b where id = #{id}")
    User getUserIdB(Integer id);

    @Update("update user_b set user_name = #{user_name}, user_id = #{user_id}, user_password = #{user_password} where id = #{id}")
    boolean updateB(User user);

    @Delete("delete from user_b where id = #{id}")
    boolean deleteB(Integer id);

    @Select("select * from user_b where user_id = #{user_id}")
    List<User> getUser_IdB(String user_id);


    //// 超级管理员操作
    @Select("SELECT * FROM (SELECT * FROM user_a WHERE user_role IN ('Admin', 'superAdmin') UNION  SELECT * FROM user_b WHERE user_role IN ('Admin', 'superAdmin') ) AS admin_tables")
    List<User> getAllAdmin();
    //     // IN ('Admin', 'superAdmin')




}
