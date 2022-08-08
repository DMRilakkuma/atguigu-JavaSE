package com.atguigu.java;

import org.junit.jupiter.api.Test;
import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-12-06 15:43
 */
public class StringTest1 {

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = "abc123中国";
        byte[] bytes  = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));
        System.out.println("****************************");
        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(gbks,"gbk");
        System.out.println(str3);
    }

    @Test
    public void test2(){
        String str = "abc123";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        char [] c2 = new char[]{'1','2','3','4','5','6'};
        String s2 = new String(c2);
        System.out.println(s2);
    }




    @Test
    public void test(){
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        String s = String.valueOf(num);
        System.out.println(s);

    }
}
