public class Tiling {
    public static int func(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical choice
        int vchoice = func(n-1);

        // horizontal choice

        int hchoice = func(n-2);

        //total ways = h+v

        return vchoice + hchoice;

    }
    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
// CHECK CALL STACK
