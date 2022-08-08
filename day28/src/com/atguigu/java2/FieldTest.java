package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author MC
 * @create 2022-05-02 17:02
 * @Description:
 */
public class FieldTest {

    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

        //获取属性结构
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }


        Field [] declaredField = clazz.getDeclaredFields();
        for(Field f : declaredField){
            System.out.println(f);
        }
    }

    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers)+'\t');

            //数据类型
            Class<?> type = f.getType();
            System.out.print(type+"\t");

            //变量名
            String fname = f.getName();
            System.out.println(fname);
            System.out.println();
        }
    }


}
