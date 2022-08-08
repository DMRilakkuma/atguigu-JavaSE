package com.atguigu.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shkstart
 * @create 2022-04-16 21:57
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inte1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inte1);

            InetAddress inte2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inte2);

            InetAddress inte3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inte3);

            System.out.println(inte2.getHostName());
            System.out.println(inte1.getHostAddress());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


    }
}
