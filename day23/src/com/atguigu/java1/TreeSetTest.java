package com.atguigu.java1;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2022-03-23 16:50
 */
public class TreeSetTest {
    @Test
    public void test(){

        Comparator com = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(),user2.getAge());

                }else{
                    throw new RuntimeException("输入类型不符");
                }
            }
        };
        TreeSet set = new TreeSet(com);
//        set.add(123);
//        set.add(-78);
//        set.add(89);
//        set.add(90);
//        set.add(-90);

        set.add(new User("a",27));
        set.add(new User("c",29));
        set.add(new User("b",24));
        set.add(new User("e",23));
        set.add(new User("d",22));
        set.add(new User("n",21));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
