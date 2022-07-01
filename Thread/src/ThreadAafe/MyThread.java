package ThreadAafe;

public class MyThread extends Thread{
    private Account acc;

    public MyThread(Account acc,String name)
    {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
