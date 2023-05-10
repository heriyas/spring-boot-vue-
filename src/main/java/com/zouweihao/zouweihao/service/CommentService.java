package com.zouweihao.zouweihao.service;

import com.zouweihao.zouweihao.entity.Comment;

import java.util.List;

public interface CommentService {

    boolean save(Comment comment) ;

    List<Comment> getAllByForeignId(Integer foreign_id);

}
