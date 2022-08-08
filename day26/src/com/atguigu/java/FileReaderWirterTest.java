package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author shkstart
 * @create 2022-04-01 15:54
 */
public class FileReaderWirterTest {

    //    public static void main(String[] args) {
//        File file = new File("hello.txt");
//        System.out.println(file.getAbsolutePath());
//
//        File file2 = new File("day26\\hello.txt");
//        System.out.println(file2.getAbsolutePath());
//    }
    @Test
    public void test() {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

//        int data = fr.read();
//        while (data != -1) {
//            System.out.println((char) data);
//            data= fr.read();
//        }

            int data;
            while ((data = fr.read()) != -1) {
                System.out.println((char) data);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test2() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");
            fr = new FileReader(file);

            char[] cbuf = new char[5];
            fr.read(cbuf);
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    @Test
    public void test3() throws IOException {
        FileWriter fw = null;
        try {
            File file = new File("hello1.txt");
            fw = new FileWriter(file,true);
            fw.write("I have a dream");
            fw.write("you need a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }


    }

    @Test
    public void test4() throws IOException {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            File scrfile  = new File("hello.txt");
            File destfile  = new File("hello2.txt");

            fr = new FileReader(scrfile);
            fw = new FileWriter(destfile);

            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





    }
}
