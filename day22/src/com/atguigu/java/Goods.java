package com.atguigu.java;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shkstart
 * @create 2022-01-06 15:26
 */
public class Goods implements Comparable {

    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                return -1;

            } else {
//                return 0;
                return -this.name.compareTo(goods.name);
            }

        }
        throw new RuntimeException("传入类型不一致");
    }



}





