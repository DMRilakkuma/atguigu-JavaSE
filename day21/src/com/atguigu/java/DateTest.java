package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.Date;



/**
 * @author shkstart
 * @create 2021-12-07 20:42
 */
public class DateTest {
    @Test
    public void test(){
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        Date date2 =new Date(123456789L);
        System.out.println(date2);

        java.sql.Date date = new java.sql.Date(2344576767L);
        System.out.println(date);

        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());


    }
}
