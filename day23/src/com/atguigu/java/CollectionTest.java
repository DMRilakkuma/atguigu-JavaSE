package com.atguigu.java;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-03-21 17:34
 */
public class CollectionTest {
    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Tom", 20));
        boolean contians = coll.contains(123);
        System.out.println(contians);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("Tom", 20)));

        Collection coll1 = Arrays.asList(123, 3454);
        System.out.println(coll.containsAll(coll1));


    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(123);
        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        Collection coll1 = Arrays.asList(456, false);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

//        Collection coll1 = Arrays.asList(456, false);
//
//        coll.retainAll(coll1);
//        System.out.println(coll);

        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new Person("Jerry", 20));
        coll2.add(new String("Tom"));
        coll2.add(false);


        System.out.println(coll.equals(coll2));
    }

    @Test
    public void test4() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        System.out.println(coll.hashCode());

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list.size());
        List<Integer> list2 = Arrays.asList(new Integer[]{123, 345, 567});
        System.out.println(list2.size());

        List<int[]> ints = Arrays.asList(new int[]{123, 345, 567});
        System.out.println(ints.size());


    }


}
