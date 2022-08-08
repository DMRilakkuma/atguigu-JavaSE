package atguigu.java;

/**
 * @author shkstart
 * @create 2021-11-17 15:48
 */

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }


        }
    }

    public HelloThread(String name) {
        super(name);
    }


}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread:1");
        h1.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        h1.start();


        Thread.currentThread().setName("主线程");


        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if (i == 20) {
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println(h1.isAlive());
        System.out.println(h1.getPriority());
        System.out.println(Thread.currentThread().getPriority());
    }
}
