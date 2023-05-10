package com.zouweihao.zouweihao.entity;

public class Room {
    private Integer id;
    private int room_number;
    private int room_floor;
    private int room_price;
    private int room_status;
    private String room_style;
    private String room_img;
    private String room_description;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", room_number=" + room_number +
                ", room_floor=" + room_floor +
                ", room_price=" + room_price +
                ", room_status=" + room_status +
                ", room_style='" + room_style + '\'' +
                ", room_img='" + room_img + '\'' +
                ", room_description='" + room_description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public int getRoom_floor() {
        return room_floor;
    }

    public void setRoom_floor(int room_floor) {
        this.room_floor = room_floor;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public int getRoom_status() {
        return room_status;
    }

    public void setRoom_status(int room_status) {
        this.room_status = room_status;
    }

    public String getRoom_style() {
        return room_style;
    }

    public void setRoom_style(String room_style) {
        this.room_style = room_style;
    }

    public String getRoom_img() {
        return room_img;
    }

    public void setRoom_img(String room_img) {
        this.room_img = room_img;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }
}
