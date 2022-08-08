package com.atguigu.src;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author shkstart
 * @create 2022-03-25 22:38
 */
public class TreeMapTest {
    @Test
    public void test(){
        TreeMap map = new TreeMap(new Comparator() {
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
        });

        User u1 = new User("ling",7);
        User u2 = new User("ging",90);
        User u3 = new User("king",20);
        User u4 = new User("aing",18);
        User u5 = new User("lding",19);

        map.put(u1,123);
        map.put(u2,023);
        map.put(u3,1243);
        map.put(u4,1233);
        map.put(u5,12332);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
