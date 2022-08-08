package com.atguigu.java;

import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-12-02 23:22
 */
public class StringTest {
    @Test
    public void test2() {
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("javaee");
        String s4 = new String("javaee");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3);
        System.out.println(s4 == s3);


        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
        p1.name = "Joy";
        System.out.println(p2.name);
        System.out.println(p1.name == p2.name);


    }

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";

        s2 += "def";

        System.out.println(s1);
        System.out.println(s2);

        String s4 = s1.replace("a", "m");
        System.out.println(s4);
        System.out.println(s1);


    }
}
