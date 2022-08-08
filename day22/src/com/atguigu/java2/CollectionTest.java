package com.atguigu.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author shkstart
 * @create 2022-03-21 16:27
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("abc");
        coll.add(new Date());
        coll.add('A');

        System.out.println(coll.size());

        System.out.println(coll);

        coll.clear();
        System.out.println(coll.size());

        System.out.println(coll.isEmpty());
    }
}
