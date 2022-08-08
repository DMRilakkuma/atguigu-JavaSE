package com.atguigu.java2;

import com.atguigu.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author MC
 * @create 2022-05-02 17:19
 * @Description:
 */
public class MethodTest {
    @Test
    public void test() {
        Class<Person> clazz = Person.class;
        Method[] method = clazz.getMethods();
        for (Method m : method) {
            System.out.println(m);
        }

        System.out.println();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method l : declaredMethods) {
            System.out.println(l);
        }
    }


    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //获取方法声明的注释
            Annotation[] annos = m.getAnnotations();
            for (Annotation a : annos) {
                System.out.println(a);
            }

            //权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //返回值类型
            System.out.print(m.getReturnType().getName() + "\t");

            //方法名
            System.out.println(m.getName() + "\t");
            System.out.print("(");
            //形参列表
            Class[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {

                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ",");

                }

            }
            System.out.print(")");

            Class[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print("throws");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");


                }
            }


            System.out.println();


        }
    }
}
