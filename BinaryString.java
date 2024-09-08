public class BinaryString {
    public static void func(int n, int lastplace, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        func(n-1, 0, str + "0");
        if(lastplace==0)
        {
            func(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        func(3, 0, " ");
    }
}
