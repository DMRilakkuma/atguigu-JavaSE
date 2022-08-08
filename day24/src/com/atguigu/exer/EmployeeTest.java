package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2022-03-24 16:35
 */
public class EmployeeTest {

    @Test
    public void test1() {
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("l", 20, new MyDate(2010, 6, 2));
        Employee e2 = new Employee("l", 22, new MyDate(1989, 5, 6));
        Employee e3 = new Employee("l", 18, new MyDate(1999, 10, 8));
        Employee e4 = new Employee("l", 19, new MyDate(1977, 4, 10));
        Employee e5 = new Employee("l", 21, new MyDate(1980, 7, 5));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate m1 = e1.getBirthday();
                    MyDate m2 = e2.getBirthday();
                    int sumyear = m1.getYear() - m1.getYear();
                    if (sumyear != 0) {
                        return sumyear;
                    }

                    int minmonth = m1.getMonth() - m2.getMonth();
                    if (minmonth != 0) {
                        return minmonth;
                    }

                    int minday = m1.getDay() - m2.getDay();
                    if (minday != 0) {
                        return minday;
                    }

                }
                return 0;
            }
        });
        Employee e1 = new Employee("liudehua", 20, new MyDate(2010, 6, 2));
        Employee e2 = new Employee("gujuji", 22, new MyDate(1989, 5, 6));
        Employee e3 = new Employee("zhouxingchi", 18, new MyDate(1999, 10, 8));
        Employee e4 = new Employee("yangying", 19, new MyDate(1977, 4, 10));
        Employee e5 = new Employee("xushong", 21, new MyDate(1980, 7, 5));
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
