package ExcecutorService;

public class Myrunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
