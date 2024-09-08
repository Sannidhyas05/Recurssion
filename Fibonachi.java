import java.util.Scanner;

public class Fibonachi {
    public static int num (int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

        int numn = num(n-1) + num(n-2);
        return numn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
    }
}


// stack call: main -> 5; num -> 5 ; num -> 4&3 -> num -> 4 -> 3 &2 -> num ->3 -> 2&1 -> num ->2 -> 1&0 -> return 1 & 0;