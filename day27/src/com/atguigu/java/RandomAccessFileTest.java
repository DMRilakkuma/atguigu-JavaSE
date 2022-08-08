package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author shkstart
 * @create 2022-04-13 16:55
 */
public class RandomAccessFileTest {
    @Test
    public void test() throws IOException {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("Rog.png"), "r");
            raf2 = new RandomAccessFile(new File("Rog2.png"), "rw");

            byte[] bytes = new byte[2014];
            int len;
            while ((len = raf1.read(bytes)) != -1) {
                raf2.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile rdaf = new RandomAccessFile(new File("hello.txt"), "rw");
        rdaf.seek(3);
        rdaf.write("xyz".getBytes());
        rdaf.close();


    }

    @Test
    public void test3() throws IOException {
        RandomAccessFile rdaf = new RandomAccessFile(new File("hello.txt"), "rw");
        rdaf.seek(3);
        rdaf.write("xyz".getBytes());


        StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
        byte [] buffer = new byte[20];
        int len;
        while ((len = rdaf.read(buffer)) != -1){
            builder.append(new String(buffer,0,len));

        }
        rdaf.seek(3);
        rdaf.write("xyz".getBytes());

        rdaf.write(builder.toString().getBytes());
        rdaf.close();
    }
}
