package com.mabf.entity;

import java.util.List;

public class Author implements Comparable<Author> {
    // 定义作家的属性
    private String name;
    private int age;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books;

    // 构造函数
    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 重写toString方法，方便打印作家信息
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return o.age - this.getAge();
    }
}
