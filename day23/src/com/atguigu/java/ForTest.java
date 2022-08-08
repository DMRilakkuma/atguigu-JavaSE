package com.atguigu.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2022-03-21 21:56
 */
public class ForTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

//        for(Object obj : coll){
//            System.out.println(obj);
//        }
//
//
//        int arr[] = {1,2,3,4,56,89};
//        for(int i : arr){
//            System.out.println(i);
//
//        }
          String [] string  ={"AA","BB","CC"};
          for(String s : string){
              s = "GG";
          }

        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i]);
        }


    }

}
