package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity  //写一个学生类的框架
public class students {
    @Id  //主键
    private String name;
    private int age;
    private String sex;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    }