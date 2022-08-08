package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.time.*;

/**
 * @author shkstart
 * @create 2021-12-10 15:01
 */
public class JDK8DateTimeTest {
    @Test
    public void test1(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println("******** ************************************");
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,12,2,15,24,35);
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate1.getDayOfMonth());

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime2.getHour());

        LocalDateTime localDateTime3 = localDateTime.plusMonths(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(4);
        System.out.println(localDateTime4);
        System.out.println(localDateTime);

    }


    @Test
    public void test(){
        Instant instant = Instant.now();
        System.out.println(instant);

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long milli = instant.toEpochMilli();
        System.out.println(milli);

        Instant instant1 = Instant.ofEpochMilli(1641448209577l);
        System.out.println(instant1);

    }
}
