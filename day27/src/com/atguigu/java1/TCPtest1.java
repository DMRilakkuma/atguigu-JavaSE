package com.atguigu.java1;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author shkstart
 * @create 2022-04-17 18:09
 */
public class TCPtest1 {
    @Test
    public void client() throws IOException {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);
            os = socket.getOutputStream();
            os.write("你好，我是客户端mm".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {

                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if (socket != null) {

                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    @Test
    public void server() throws IOException {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            ss = new ServerSocket(8899);
            socket = ss.accept();

            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int len;
            while ((len = is.read(bytes)) != -1) {
                baos.write(bytes, 0, len);

            }
            System.out.println(baos.toString());

            System.out.println(socket.getInetAddress().getHostAddress());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (baos != null) {

                baos.close();
            }

            if (is != null) {
                is.close();
            }

            if (socket != null) {
                socket.close();

            }

            if (ss != null) {
                ss.close();
            }


        }


    }
}
