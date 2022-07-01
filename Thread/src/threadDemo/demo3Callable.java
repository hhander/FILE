package threadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo3Callable {
    public static void main(String[] args) {
        Callable<String> call = new MyCallable(100);
        FutureTask<String> f = new FutureTask<>(call);
        Thread t = new Thread(f);
        t.start();


        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();


        try {
            System.out.println("线程1" + f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("线程2" + f2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyCallable implements Callable<String>
{
    private int n;
    public MyCallable(int n)
    {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < this.n; i++) {
            sum+=i;
        }
        return "的结果为" + sum;
    }
}
