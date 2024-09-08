public class Sum
{
    public static int sumn(int n)
    {
        if(n==1)
        {
            return 1;
        }
        //int sumnm1 = sumn(n-1);
        int sum = n +sumn(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumn(n));
    }
}

// call stack : main-> n = 5; sumn -> 5; sumn -> 4; sumn ->3 ; sumn->2; sumn-> 1; if condition true -> return 1 -> 
//               print 15  <-(5+10 = 15) <- (4+6 = 10)  <-(3+3 = 6)   <- (2+1 = 3)