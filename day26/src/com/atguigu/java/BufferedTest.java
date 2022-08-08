package com.atguigu.java;

import org.junit.Test;

import java.io.*;
import java.nio.Buffer;

/**
 * @author shkstart
 * @create 2022-04-07 14:56
 */
public class BufferedTest {
    @Test
    public void BufferedStreamTest() throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File scrFile = new File("Rog.png");
            File destFile = new File("Rog3.png");

            FileInputStream fis = new FileInputStream(scrFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[10];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void bufftest(String scr, String dest){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File scrFile = new File(scr);
            File destFile = new File(dest);

            FileInputStream fis = new FileInputStream(scrFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[10];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {

                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {

                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test4(){
        long start = System.currentTimeMillis();

        bufftest("E:\\视频录制\\ScreenRecorderProject1.mkv","E:\\视频录制\\ScreenRecorderProject2.mkv");

        long end = System.currentTimeMillis();

        System.out.println( end - start);
    }



    @Test
    public void test5() throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("hello.txt")));
            bw = new BufferedWriter(new FileWriter(new File("hello3.txt")));
            char[] chars = new char[10];
            int len;
            while((len = br.read(chars))!= -1){
                bw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
