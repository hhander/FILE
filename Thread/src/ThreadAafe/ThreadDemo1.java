package ThreadAafe;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Account a = new Account(100000);

        Thread t1 = new MyThread(a,"小明");
        t1.start();
        Thread t2 = new MyThread(a,"小日");
        t2.start();

        System.out.println(a.getMoney());
    }
}
