package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author shkstart
 * @create 2022-04-06 15:52
 */
public class FileInputOutputStream {
    @Test
    public void test() throws IOException {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");

            fis = new FileInputStream(file);

            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                String str = new String(bytes, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }


    }

    @Test
    public void test3() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File scrFile = new File("Rog.png");
            File destFile = new File("Rog2.png");

            fis = new FileInputStream(scrFile);
            fos = new FileOutputStream(destFile);

            byte[] bytes = new byte[5];
            int len;
            while ((len = fis.read(bytes))!= -1){
                fos.write(bytes,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos != null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }

    @Test
    public  void test4(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File scrFile = new File("C:\\Users\\MC\\Pictures\\Saved Pictures\\Rog.png");
            File destFile = new File("C:\\Users\\MC\\Pictures\\Saved Pictures\\Rog2.png");

            fis = new FileInputStream(scrFile);
            fos = new FileOutputStream(destFile);

            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes))!= -1){
                fos.write(bytes,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos != null){

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //重写toString




    }

//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        test4("C:\\Users\\MC\\Pictures\\Saved Pictures\\Rog.png","C:\\Users\\MC\\Pictures\\Saved Pictures\\Rog2.png");
//
//        long end = System.currentTimeMillis();
//    }
}
