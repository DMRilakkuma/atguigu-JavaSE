package atguigu.java;

/**
 * @author shkstart
 * @create 2021-11-18 21:09
 */

class MThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
       MThread myThread = new MThread();
        Thread t = new Thread(myThread);
        t.start();
    }
}
