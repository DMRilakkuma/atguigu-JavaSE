package com.atguigu.java2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author shkstart
 * @create 2022-03-31 14:22
 */
public class FileTest {
    @Test
    public void test() {
        File file1 = new File("hello.txt");
        System.out.println(file1);
        File file2 = new File("D:\\IDEA\\JavaSenior\\day25\\he.txt");
        System.out.println(file2);

        File file3 = new File("D:\\IDEA", "JavaSenior");
        System.out.println(file3);

        File file4 = new File(file3, "hell.txt");
        System.out.println(file4);
    }


    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\he.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println("*********************************");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());


    }

    @Test
    public void test3() {
        File file1 = new File("D:\\IDEA\\JavaSenior");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("*********************");
        File[] files = file1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    @Test
    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\he.txt");
        boolean b = file2.renameTo(file1);
        System.out.println(b);

    }

    @Test
    public void test5(){
        File file1 = new File("hello.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println("**************************");

        File file2 =new File("D:\\io");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }

    @Test
    public void test6() throws IOException {
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{
            file1.delete();
            System.out.println("删除成功");
        }

    }

    @Test
    public  void test7(){
        File file1 = new File("D:\\io\\io1\\io3");
        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功");
        }

        File file2 = new File("D:\\io\\io1\\io4");
        boolean mkdir1 = file2.mkdirs();
        if(mkdir1){
            System.out.println("创建成功");

        }

    }
}
