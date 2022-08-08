package com.atguigu.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * @author MC
 * @create 2022-05-02 13:00
 * @Description:
 */
public class ClassLoaderTest {
    @Test
    public void test() {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader2 = classLoader.getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3);

        ClassLoader Loader = String.class.getClassLoader();
        System.out.println(Loader);
    }


    @Test
    public void test2() throws IOException {
        Properties pro = new Properties();
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pro.load(is);

        String user = pro.getProperty("user");
        String password = pro.getProperty("password");
        System.out.println("user = "+user +" password = "+password);

    }
}
