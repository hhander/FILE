package ExcecutorService;

import java.util.concurrent.Callable;

public class demo3_Callable implements Callable<String> {
    private int n;
    demo3_Callable(int n)
    {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < this.n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName() + "从1-" + this.n + "的结果是" + sum;
    }
}
