package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author shkstart
 * @create 2022-04-12 19:40
 */
public class InputStreanmReader {

    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("hello.txt");
        InputStreamReader isr = new InputStreamReader(fis);

//        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        char[] cr = new char[20];
        int len;
        while((len = isr.read(cr)) != -1) {
            String str = new String(cr,0,len);
            System.out.println(str);
        }

        isr.close();


    }
}
