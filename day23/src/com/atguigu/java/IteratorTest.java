package com.atguigu.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2022-03-21 20:57
 */
public class IteratorTest {
    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


        Iterator iterator = coll.iterator();
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if(obj.equals("Tom")){
                iterator.remove();
            }
        }

        System.out.println(coll);

    }
}
