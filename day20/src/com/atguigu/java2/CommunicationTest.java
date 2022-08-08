package com.atguigu.java2;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @author shkstart
 * @create 2021-11-29 19:43
 */
class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                } else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();

    }
}
