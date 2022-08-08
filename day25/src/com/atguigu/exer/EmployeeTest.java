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
        TreeSet<Employee> set = new TreeSet<>();
        Employee e1 = new Employee("v", 20, new MyDate(2010, 6, 2));
        Employee e2 = new Employee("d", 22, new MyDate(1989, 5, 6));
        Employee e3 = new Employee("b", 18, new MyDate(1999, 10, 8));
        Employee e4 = new Employee("a", 19, new MyDate(1977, 4, 10));
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
        TreeSet <Employee >set = new TreeSet<>(new Comparator<Employee>() {


            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate b1 = o1.getBirthday();
                MyDate b2 = o2.getBirthday();
                int valueyear = b1.getYear() - b2.getYear();
                if(valueyear != 0){
                    return valueyear;
                }

                int valueMonth = b1.getMonth() - b2.getMonth();
                if(valueMonth != 0){
                    return valueMonth;
                }

                return  b1.getDay() - b2.getDay();


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
