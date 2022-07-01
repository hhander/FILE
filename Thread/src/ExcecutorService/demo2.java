package ExcecutorService;

import java.util.concurrent.*;

public class demo2 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Runnable r = new Myrunnable();
        es.execute(r);
        es.execute(r);
        es.execute(r);
        es.execute(r);
        es.execute(r);

        es.execute(r);
        es.execute(r);
        es.execute(r);
        es.execute(r);
        es.execute(r);

        es.execute(r);
    }
}
