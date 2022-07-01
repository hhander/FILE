package threadDemo;

public class demo {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("线程2" + i);
        }
    }

}

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1" + i);
        }
    }
}
