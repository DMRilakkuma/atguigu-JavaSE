package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author shkstart
 * @create 2022-04-18 20:35
 */
public class TCPtest2 {
    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream(new File("Rog.png"));

        byte bytes[] = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!= -1){
            os.write(bytes, 0, len);
        }

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
        byte [] bytes = new byte[1024];
        int len;
        while((len = is.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }

        ss.close();
        socket.close();
        is.close();
        fos.close();




    }
}
