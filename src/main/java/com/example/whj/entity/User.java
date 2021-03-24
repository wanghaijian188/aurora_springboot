package com.example.whj.entity;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private Date registeredtime;
    private Date landingtime;
    private String avatar;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisteredtime() {
        return registeredtime;
    }

    public void setRegisteredtime(Date registeredtime) {
        this.registeredtime = registeredtime;
    }

    public Date getLandingtime() {
        return landingtime;
    }

    public void setLandingtime(Date landingtime) {
        this.landingtime = landingtime;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
