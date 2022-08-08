package com.atguigu.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
 * 印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】
 * 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的。
 *
 * @author shkstart
 * @create 2021-11-25 15:23
 */
class Account {
    private double balance;
    private ReentrantLock lock  = new ReentrantLock();

    public Account() {

    }

    public Account(double balance) {
        this.balance = balance;
    }


//    方法一：
    public synchronized void deposit() {
        for (int i = 0; i < 3; i++) {
            balance += 1000;
            System.out.println(Thread.currentThread().getName() + "：存款：" + balance);
        }
    }

    //方法二：
//    public  void deposit() {
//
//            for (int i = 0; i < 3; i++) {
//                try {
//                    lock.lock();
//                    balance += 1000;
//                    System.out.println(Thread.currentThread().getName() + "：存款：" + balance);
//                } finally {
//                    lock.unlock();
//
//                }
//            }
//
//
//        }
    }



class Window extends Thread {
    private Account account;

    public Window(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        account.deposit();


    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Window w1 = new Window(account);
        Window w2 = new Window(account);
        w1.setName("储户一");
        w2.setName("储户二");
        w1.start();
        w2.start();

    }
}
