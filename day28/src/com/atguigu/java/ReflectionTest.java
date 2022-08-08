package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author MC
 * @create 2022-04-20 13:42
 * @Description:
 */
public class ReflectionTest {
    @Test
    public void test1(){
        Person p1 = new Person("王兵",21);
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //通过反射创建Person类对象
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p.toString());

        //通过反射,调用对象指定的属性和方法
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        System.out.println("*******************************");
        //通过反射调用私有结构。比如私有构造器，属性，方法

        //调用私有构造器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 =(Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Han");
        System.out.println(p1);

        //调用私有方法
        Method showString = clazz.getDeclaredMethod("showString", String.class);
        showString.setAccessible(true);
        showString.invoke(p1,"中国");


    }


    @Test
    public void test3() throws ClassNotFoundException {
        //调用运行时类的对象。class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        //调用运行时类的对象，调用getClass()
        Person p = new Person();
        Class<? extends Person> clazz2 = p.getClass();
        System.out.println(clazz2);

        //调用class类的静态方法
        Class<?> clazz3 = Class.forName("com.atguigu.java.Person");
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz2);

        //比较
        ClassLoader loader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = loader.loadClass("com.atguigu.java.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz4);

    }


}
