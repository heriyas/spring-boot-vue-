package com.zouweihao.zouweihao.controller;

import com.zouweihao.zouweihao.entity.Comment;
import com.zouweihao.zouweihao.service.CommentService;
import com.zouweihao.zouweihao.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommetnController {

    @Autowired
    CommentService commentService;

    @PostMapping("/comment")
    public Result save(@RequestBody Comment comment) {
        commentService.save(comment);
        return new Result(200,"OK");
    }
    @GetMapping("/comment/{foreign_id}")
    public Result getAllByForeignId(@PathVariable Integer foreign_id) {
        System.out.println("查所有评论");
        List<Comment> commentList = commentService.getAllByForeignId(foreign_id);
        System.out.println(commentList);
        return new Result(200,"OK", commentList);
    }



}
