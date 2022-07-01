package threadDemo;

public class demo2Runnable {
    public static void main(String[] args) {
        new Thread(() ->{
                for (int i = 0; i < 10; i++) {
                    System.out.println("子进程" + i);}
        }).start();


        for (int j = 0; j < 10; j++) {
            System.out.println("主线程" + j);
        }
    }
}
