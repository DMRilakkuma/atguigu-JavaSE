package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author MC
 * @create 2022-05-03 17:18
 * @Description:
 */
public class OtherTest {
    @Test
    public void test() throws NoSuchMethodException {
        Class<Person> clazz = Person.class;
        Constructor [] constructor = clazz.getConstructors();
        for(Constructor  c : constructor){
            System.out.println(c);
        }


        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }

    }

    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    public void test3(){
        Class<Person> clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramtype = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = paramtype.getActualTypeArguments();
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    @Test
    public void test4(){
        Class<Person> clazz = Person.class;
        Class<?>[] interfaces = clazz.getInterfaces();
        for(Class<?> n : interfaces){
            System.out.println(n);
        }
        System.out.println();
        Class<?>[] superinterface = clazz.getSuperclass().getInterfaces();
        for(Class n : superinterface){
            System.out.println(n);
        }


    }
}
