package com.zouweihao.zouweihao.dao;


import com.zouweihao.zouweihao.entity.Comment;
import com.zouweihao.zouweihao.entity.Room;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentDao  {

    @Insert("insert into comments ( content, user_name, user_id, foreign_id) values( #{content}, #{user_name}, #{user_id}, #{foreign_id})")
    boolean save(Comment comment);

    @Select("select * from comments where foreign_id = #{foreign_id}")
    List<Comment> getAllByForeignId(Integer foreign_id);
}
