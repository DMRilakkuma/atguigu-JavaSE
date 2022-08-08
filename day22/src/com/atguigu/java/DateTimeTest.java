package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-12-09 18:29
 */
public class DateTimeTest {
    @Test
    public void simpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
//      格式化，日期到字符
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);
        // 格式化逆过程，字符到日期
        String str = "19-12-8 下午7:45";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //按照指定格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf.format(date);
        System.out.println(format1);

        Date date2 = sdf1.parse("2020-12-8 11:48:12");
        System.out.println(date2);


    }

    @Test
    public void testExer() throws ParseException {
        String date = "2020-12-2 11:12:45";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date p = sdf.parse(date);
        java.sql.Date date1 = new java.sql.Date(p.getTime());
        System.out.println(date1);

    }

    @Test
    public void testCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        int year = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);

        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        int days1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);


        //add()
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        int days2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days2);

        //getime()
        Date date = calendar.getTime();
        System.out.println(date);

        //setime()
        Date date1 = new Date();
        calendar.setTime(date1);
        Date time = calendar.getTime();
        System.out.println(time);

    }


}
