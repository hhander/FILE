package filedemo;

public class getBeer {

    public static int lastBottle;
    public static int lastCover;
    public static int totalBeer;

    public static void main(String[] args) {
        buyBeer(10);
        System.out.println(Integer.toString(totalBeer) + lastBottle + lastCover);
    }

    private static void buyBeer(int money) {

        int buyNum = money/2;
        totalBeer += buyNum;
        int EmptyBottle = buyNum + lastBottle;
        int Cover = buyNum + lastCover;

        int totalMoney = 0;
        if(EmptyBottle>=2) {
            totalMoney += (EmptyBottle / 2) * 2;
        }
        lastBottle = EmptyBottle % 2;

        if(Cover>=4) {
            totalMoney += (Cover / 4) * 2;

        }
        lastCover = Cover % 4;

        if(totalMoney>=2)
        {
            buyBeer(totalMoney);
        }

    }
}
