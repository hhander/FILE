package ExcecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo1 {
    public static void main(String[] args) {
        Thread t = new Mythread2();
        Lock l = new ReentrantLock();

    }

}
