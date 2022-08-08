package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author shkstart
 * @create 2022-04-18 21:09
 */
public class TCPtest3 {
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream(new File("Rog.png"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] bytess = new byte[1024];
        int len1;
        while ((len1 = is.read(bytess)) != -1) {
            bos.write(bytess, 0, len1);

        }

        System.out.println(bos.toString());


        System.out.println(bos.toString());
        socket.close();
        os.close();
        fis.close();

    }

    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("Rog4.png"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }


        OutputStream os = socket.getOutputStream();
        os.write("已经收到".getBytes());
        System.out.println(os.toString());


        ss.close();
        socket.close();
        is.close();
        fos.close();


    }

}
