package com.atguigu.java2;

import javax.xml.ws.Service;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author shkstart
 * @create 2021-11-30 15:54
 */
class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }

    }
}
class NumberThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }

    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        System.out.println(service.getClass());
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
//        service1.setCorePoolSize(15);

        service.execute(new NumberThread());
        service.execute(new NumberThread1());
//        service.submit();适用于Callable

        service.shutdown();
    }

}
