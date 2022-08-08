package com.atguigu.java;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2022-04-13 15:20
 */
public class Person implements Serializable {
    public static final long serialVersionUID = 54367655646L;
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
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



}
