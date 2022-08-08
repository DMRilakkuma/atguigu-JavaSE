package com.atguigu.java1;

import java.lang.invoke.SerializedLambda;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2021-11-25 14:02
 */
class Windows implements Runnable {
    private static int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                lock.unlock();

            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
