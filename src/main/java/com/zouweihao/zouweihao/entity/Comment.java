package com.zouweihao.zouweihao.entity;


import java.time.LocalDate;


public class Comment {
    private Integer id;
    private String content;
    private String user_name;
    private Integer user_id;
    private Integer foreign_id;
    private Integer pid;
    private String target;
    private LocalDate create_time;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_id=" + user_id +
                ", foreign_id=" + foreign_id +
                ", pid=" + pid +
                ", target='" + target + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getForeign_id() {
        return foreign_id;
    }

    public void setForeign_id(Integer foreign_id) {
        this.foreign_id = foreign_id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public LocalDate getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDate create_time) {
        this.create_time = create_time;
    }
}
