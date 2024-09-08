public class Pq2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void func(int n)
    {
        if(n==0)
        {
            return;
        }
         int lastdigit = n%10;
         func(n/10);
         System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        func(1947);
    }
}
