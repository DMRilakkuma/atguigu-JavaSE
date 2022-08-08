package com.atguigu.listTest;

import com.atguigu.java.Person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-22 22:43
 */
public class Arraylist {

    @Test
    public void test() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new Person("Tom",20));
        list.add(456);
        System.out.println(list);

        list.add(1,"AA");
        System.out.println(list);

        List list1 = Arrays.asList(1,2,3);
        list.addAll(list1);
        System.out.println(list);

        Object obj = list.get(2);
        System.out.println(obj);

        int i = list.indexOf(456);
        int y = list.lastIndexOf(456);
        System.out.println("i = "+i+",y = "+y);

        Object remove = list.remove(4);
        System.out.println(list);
        System.out.println(remove);

        list.set(1,"BB");
        System.out.println(list);

        List list2 = list.subList(1, 4);
        System.out.println(list2);
    }
}
