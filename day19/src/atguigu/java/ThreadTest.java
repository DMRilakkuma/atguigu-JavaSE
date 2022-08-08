package atguigu.java;

/**
 * 创建多线程
 *
 * @author shkstart
 * @create 2021-11-16 16:14
 */


class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }


        }
    }

}

/**
 * @author MC
 */
public class ThreadTest {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        Mythread t2 = new Mythread();
        t2.start();


        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }


        }
    }
}
