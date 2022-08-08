package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author MC
 * @create 2022-05-05 14:19
 * @Description:
 */
public class Reflection {
    @Test
    public void testField() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Person p = (Person) clazz.newInstance();

        //获取指定属性
        Field id = clazz.getField("age");
        id.set(p, 1001);
        int pd = (int) id.get(p);
        System.out.println(pd);
    }

    @Test
    public void test() throws InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "Tom");
        String s = (String) name.get(p);
        System.out.println(s);


    }

    @Test
    public void testMethod() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();
        Method show = clazz.getDeclaredMethod("show", String.class);
        show.setAccessible(true);
        Object cnn = show.invoke(p, "CNN");
        System.out.println(cnn);
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object val = showDesc.invoke(Person.class);
        System.out.println(val);
    }

    @Test
    public void testContstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Person per = (Person) constructor.newInstance("Tom");
        System.out.println(per);

    }
}
