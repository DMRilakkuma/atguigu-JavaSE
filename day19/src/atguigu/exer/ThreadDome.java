package atguigu.exer;

/**
 * 创建两个分线程，一个遍历100以内的偶数，一个遍历一百以内的奇数
 * @author shkstart
 * @create 2021-11-17 10:50
 */
class MyTreader1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i  % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class MyTreader2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadDome {
    public static void main(String[] args) {
//        MyTreader1 t1 = new MyTreader1();
//        t1.start();
//        MyTreader2 t2 = new MyTreader2();
//        t2.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if(i  % 2 == 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
