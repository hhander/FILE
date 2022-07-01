package ExcecutorService;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TimeTask {
    public static void main(String[] args) {
        ScheduledExecutorService s = Executors.newScheduledThreadPool(3);
        s.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "正在执行");
            }
        },0,2, TimeUnit.SECONDS);
    }
}
