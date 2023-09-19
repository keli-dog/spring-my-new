package com.itheima.domain;

import java.io.Serializable;

public class Love implements Serializable {


    private String name;
    private int days;
    private String meettime;
    private String leavetime;
    private int id;

    // Getter and Setter methods for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'days'
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    // Getter and Setter methods for 'meettime'
    public String getMeettime() {
        return meettime;
    }

    public void setMeettime(String meettime) {
        this.meettime = meettime;
    }

    // Getter and Setter methods for 'leavetime'
    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime;
    }

    public Love(){}
    public Love(int id, String name, int days, String meettime, String leavetime) {
        this.id = id;
        this.name = name;
        this.days = days;
        this.meettime = meettime;
        this.leavetime = leavetime;
    }

    public Love(String name, int days) {
        this.name = name;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", days=" + days + ", meettime=" + meettime + ", leavetime=" + leavetime + "]";
    }


}
