package com.atguigu.java;


import org.junit.Test;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-29 13:33
 */
public class GenericTest1 {
    @Test
    public void test(){
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order order1 = new Order("orderAA",1001,"order:AA");
        order1.setOrderT("order:hello");
    }

    @Test
    public void test2(){
        SubOrder sub = new SubOrder();
        sub.setOrderT(1122);

        SubOrder1<String> sub1 = new SubOrder1();

        sub1.setOrderT("odrea");
    }

    @Test
    public void test3(){
        Order <String> order = new Order();
        Integer [] arr = new Integer[]{1,2,3,4};
        List<Integer> list = Order.copyFromArrayToList(arr);
        System.out.println(list);

    }

}

