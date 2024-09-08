public class Reverse {
    public static void func(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        func(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        func(n);
    }
}
