package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author MC
 * @create 2022-05-08 16:24
 * @Description:
 */
public class LambdaTest {
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
       Comparator <Integer> c1 = new Comparator<Integer>() {

           @Override
           public int compare(Integer o1, Integer o2) {
               return Integer.compare(o1,o2);
           }
       };

        int compare = c1.compare(12, 34);
        System.out.println(compare);

        System.out.println("*********************");
        Comparator <Integer> c2 = Integer::compare;
        int compare1 = c2.compare(34, 12);
        System.out.println(compare1);

    }
}
