package com.atguigu.java;

import com.atguigu.listTest.Arraylist;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2022-03-23 14:51
 */
public class ListTest {
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(new Person("Tom",20));
        list.add(456);


        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*************************");
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println("************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
