package com.atguigu.java;

import javafx.css.StyleConverter;
import org.junit.Test;

import java.util.Random;

import static com.sun.javafx.css.converters.EnumConverter.getInstance;
import static javax.xml.bind.JAXBContext.newInstance;

/**
 * @author MC
 * @create 2022-05-02 13:42
 * @Description:
 */
public class NewInstanceTest {
    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }


    @Test
    public void test2() {

        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);
            String classpath = "";

            switch (num) {
                case 0:
                    classpath = "java.util.Date";
                    break;
                case 1:
                    classpath = "java.lang.Object";
                    break;
                case 2:
                    classpath = "com.atguigu.java.Person";
                    break;
            }
            try {
                Object obj = getInstance(classpath);
                System.out.println(obj);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object getInstance(String classpath) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(classpath);
        return clazz;

    }
}
