package com.mabf.entity;

public class User {
    private String center_no;
    private String center_name;
    private String is_open;
    private String last_modi_date;

    public String getCenter_no() {
        return center_no;
    }

    public void setCenter_no(String center_no) {
        this.center_no = center_no;
    }

    public String getCenter_name() {
        return center_name;
    }

    public void setCenter_name(String center_name) {
        this.center_name = center_name;
    }

    public String getIs_open() {
        return is_open;
    }

    public void setIs_open(String is_open) {
        this.is_open = is_open;
    }

    public String getLast_modi_date() {
        return last_modi_date;
    }

    public void setLast_modi_date(String last_modi_date) {
        this.last_modi_date = last_modi_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "center_no='" + center_no + '\'' +
                ", center_name='" + center_name + '\'' +
                ", is_open='" + is_open + '\'' +
                ", last_modi_date='" + last_modi_date + '\'' +
                '}';
    }
}
