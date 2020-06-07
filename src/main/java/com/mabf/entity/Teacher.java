package com.mabf.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Teacher {
    private int id;
    @Excel(name = "老师名字")
    private String teacherName;
    @Excel(name = "老师图片")
    private String teacherImage;
    @Excel(name = "老师状态" ,replace = {"正常_0","冻结_1"})
    private int teacherState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherImage() {
        return teacherImage;
    }

    public void setTeacherImage(String teacherImage) {
        this.teacherImage = teacherImage;
    }

    public int getTeacherState() {
        return teacherState;
    }

    public void setTeacherState(int teacherState) {
        this.teacherState = teacherState;
    }

    public Teacher(int s, String s2, String s1, int i) {
        this.id = s;
        this.teacherName = s2;
        this.teacherImage = s1;
        this.teacherState=i;
    }
}
