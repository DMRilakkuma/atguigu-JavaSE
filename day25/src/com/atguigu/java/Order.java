package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-29 13:29
 */
public class Order <T>{
    String orderName;
    int orderId;
    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }


    public static <E> List<E> copyFromArrayToList(E [] arr){
        ArrayList <E> list = new ArrayList<>();
        for(E e:arr){
            list.add(e);
        }

        return list;


    }
}
