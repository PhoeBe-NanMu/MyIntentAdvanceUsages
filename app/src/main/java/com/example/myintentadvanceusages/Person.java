package com.example.myintentadvanceusages;

import java.io.Serializable;

/**
 * Created by LeiYang on 2016/8/27 0027.
 * 使用Intent传递对象
 * Serializable方式
 */

public class Person implements Serializable {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
