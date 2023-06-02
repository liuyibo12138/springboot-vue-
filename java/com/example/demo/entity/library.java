package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class library {
    @Id
    private String bookname;  //名字一定要跟数据库中表里的名称一样
    private String author;

    @Override
    public String toString() {
        return "library{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return bookname;
    }

    public void setName(String name) {
        this.bookname = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;
}
