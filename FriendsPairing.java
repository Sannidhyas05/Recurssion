public class FriendsPairing {
    int func(int n)
    {
        // base
        if(n==1 || n==2)
        {
            return n;
        }
        
        return func(n-1) + (n-1)*func(n-2);
    }
    public static void main(String[] args) {
        FriendsPairing obj = new FriendsPairing();
        System.out.println(obj.func(3));
    }
}
