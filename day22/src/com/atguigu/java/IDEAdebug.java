package com.atguigu.java;

import org.junit.jupiter.api.Test;

/**
 * @author shkstart
 * @create 2021-12-09 16:52
 */
public class IDEAdebug {
    @Test
    public void test(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);


    }
}
