package filedemo;

public class demo2 {
    public static void main(String[] args) {
        System.out.println(recurMul(1));
    }

    public static long mul(int n)
    {
        long sum = 1;
        for (int i = 1; i < n; i++) {
            sum = sum * i;

        }
        return sum;

    }

    public static long mul2(int n)
    {
        if(n>1)
        {
            return n * mul2(n - 1);
        }
        else
        {
            return 1;
        }
    }

    public static long add(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return add(n-1) + n;
        }
    }

    public static long recurMul(int n)
    {
        if(n == 10)
        {
            return 1;
        }
        else
        {
            return 2*recurMul(n+1) + 2;
        }
    }


}


