public class Power {
    public static int func1(int x, int n)
    {
        if(n==1)
        {
            return x;
        }
        return x*func(x, n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        System.out.println(func(x,n));
        System.out.println(func1(x, n));
    }

// MORE OPTIMIZED WAY


 public static int func(int x, int n)
 {
    if(n==0)
    {
        return 1;
    }   
    int halfpow = func(x, n/2);
    int result = halfpow*halfpow;

    if(n%2 != 0)
    {
        result = x*result;
    }
    return result;
 }
}

