package com.lsd.mvc.demo1.model;

import java.util.Date;

/**
 * Created by lsd on 2016/10/30.
 */
public class People {

    private String name;

    private int age;

    private Date createTime = new Date();

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
