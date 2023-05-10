package com.zouweihao.zouweihao.service.impl;

import com.zouweihao.zouweihao.dao.CommentDao;
import com.zouweihao.zouweihao.entity.Comment;
import com.zouweihao.zouweihao.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommetnService implements CommentService {

    @Autowired
    CommentDao commentDao;

    @Override
    public boolean save(Comment comment) {
        commentDao.save(comment);
        return true;
    }

    @Override
    public List<Comment> getAllByForeignId(Integer foreign_id) {
        return commentDao.getAllByForeignId(foreign_id);
    }
}
