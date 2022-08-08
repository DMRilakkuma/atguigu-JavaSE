package com.atguigu.java3;

import com.atguigu.java2.Employee;
import com.atguigu.java2.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author MC
 * @create 2022-05-11 14:36
 * @Description:
 */
public class StreamAPITest1 {
    @Test
    public void test() {
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println("*****************************");

        list.stream().limit(3).forEach(System.out::println);

        list.stream().skip(3).forEach(System.out::println);

        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1008, "扎克伯格", 35, 2500.32));

        System.out.println("************************************");

        list.stream().distinct().forEach(System.out::println);


    }

    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }

        return list.stream();

    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> nameStream = employees.stream().map(Employee::getName);
        nameStream.filter(name -> name.length() > 3).forEach(System.out::println);

    }

    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

    }
}
