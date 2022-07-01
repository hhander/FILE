package ExcecutorService;

import java.sql.Date;
import java.util.concurrent.*;

public class demo3 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Callable c = new demo3_Callable(100);
        Callable c1 = new demo3_Callable(200);
        Callable c2 = new demo3_Callable(300);
        Callable c3= new demo3_Callable(400);
        Callable c4 = new demo3_Callable(500);






    }
}
