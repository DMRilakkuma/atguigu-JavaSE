package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author shkstart
 * @create 2022-04-12 21:20
 */
public class OtherStreamTest {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = null;
        try {
            br = new BufferedReader(isr);


            String data;
            while (true) {
                System.out.println("请输入字符:");
                data = br.readLine();

                if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit")) {
                    System.out.println("程序结束");
                    break;

                }
            }

            String upperCase = data.toUpperCase();
            System.out.println(upperCase);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.writeUTF("刘建辰");
        dos.flush();
        dos.writeInt(18);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();

        dos.close();


    }

    @Test
    public void test2() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

        String s = dis.readUTF();

        int i = dis.readInt();

        boolean b = dis.readBoolean();

        System.out.println("name:"+ s + " 年龄 :" + i + " boolean :" + b) ;


    }
}
