package com.atguigu.java1;

import com.atguigu.java.Person;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shkstart
 * @create 2022-03-23 15:27
 */
public class SetTest {

    @Test
    public void test(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(123);

        set.add(new Person("Tom",12));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
