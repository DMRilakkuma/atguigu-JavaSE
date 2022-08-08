package atguigu.java;

/**
 * @author shkstart
 * @create 2021-11-18 15:02
 */
class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {

                System.out.println(Thread.currentThread().getName() + "购票,票号为：" + ticket);
            } else {
                break;
            }
            ticket--;

        }


    }


}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        w1.start();
        w2.start();
        w3.start();

    }
}


