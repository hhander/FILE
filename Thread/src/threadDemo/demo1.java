package threadDemo;

public class demo1 {
    public static void main(String[] args) {

        Runnable r = new MyThread();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + i);
        }


    }
}

class Mythread1 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + i);
        };
    }
}
