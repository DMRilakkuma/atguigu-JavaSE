package com.atguigu.java;

/**
 * @author shkstart
 * @create 2021-11-23 15:52
 */

class Window4 extends Thread {
    private static int ticket = 100;


    @Override
    public void run() {
        while (true) {
            show();


        }
    }

    public static synchronized void show() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {

            System.out.println(Thread.currentThread().getName() + "购票,票号为：" + ticket);
        }
        ticket--;
    }


}


public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();
        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        w1.start();
        w2.start();
        w3.start();

    }
}




