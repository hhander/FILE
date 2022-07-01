package ThreadAafe;

public class Account {
    private double money;

    public Account(double money) {
        this.money = money;
    }

    public synchronized void drawMoney(double money)
    {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if(this.money>=money)
            {
                System.out.println(name + "取出" + money);
                this.money = this.money - money;
                System.out.println("剩余" + this.money);
            }
            else
            {
                System.out.println(name + "余额不足");
            }
        }
    }

    public Account() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
