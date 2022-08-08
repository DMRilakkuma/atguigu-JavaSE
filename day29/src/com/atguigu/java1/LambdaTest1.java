package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author MC
 * @create 2022-05-08 17:04
 * @Description:
 */
public class LambdaTest1 {
    @Test
    public void test() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();
        System.out.println("*******************************");
        Runnable r2 = () -> System.out.println("我爱北京");
        r2.run();
    }

    @Test
    public void test2() {
        Consumer<String> r1 = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        r1.accept("谎言和誓言的区别是什么");


        Consumer<String> r2 = (String s ) -> {
            System.out.println(s);
        };
        r2.accept("傻子");

        System.out.println("******************");
        Consumer<String> r3 = (s) -> {
            System.out.println(s);
        };

        r3.accept("憨hon");
    }

    @Test
    public void test3(){
        ArrayList<String> list = new ArrayList<>();
        int [] arr = {1,2,3};

    }

    @Test
    public void test4(){
        Consumer<String> r2 = ( s ) -> {
            System.out.println(s);
        };
        r2.accept("傻子");

        System.out.println("******************");
        Consumer<String> r3 = s -> {
            System.out.println(s);
        };

        r3.accept("憨hon");

    }

    @Test
    public void test5(){
        Comparator <Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }

        };
        System.out.println(com1.compare(12,32));

        System.out.println("**********************");
        Comparator <Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        System.out.println(com2.compare(12,6));
    }
}
