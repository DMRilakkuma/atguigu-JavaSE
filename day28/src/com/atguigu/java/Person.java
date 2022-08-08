package com.atguigu.java;

/**
 * @author MC
 * @create 2022-04-20 13:41
 * @Description:
 */
public class Person {
    private String name;
    public int age;

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void show() {
        System.out.println("我很好");
    }

    private void showString(String name) {
        System.out.println("我的国籍"+ name);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
