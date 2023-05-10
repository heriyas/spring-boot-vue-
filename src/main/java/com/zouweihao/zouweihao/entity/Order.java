package com.zouweihao.zouweihao.entity;

public class Order {

    private Integer id;
    private String form_intime;
    private String form_outtime;
    private String form_content;
    private String room_id;
    private String style;
    private String user_name;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", form_intime='" + form_intime + '\'' +
                ", form_outtime='" + form_outtime + '\'' +
                ", form_content='" + form_content + '\'' +
                ", room_id='" + room_id + '\'' +
                ", style='" + style + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForm_intime() {
        return form_intime;
    }

    public void setForm_intime(String form_intime) {
        this.form_intime = form_intime;
    }

    public String getForm_outtime() {
        return form_outtime;
    }

    public void setForm_outtime(String form_outtime) {
        this.form_outtime = form_outtime;
    }

    public String getForm_content() {
        return form_content;
    }

    public void setForm_content(String form_content) {
        this.form_content = form_content;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
