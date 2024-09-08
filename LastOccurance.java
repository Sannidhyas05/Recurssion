import java.util.Scanner;

public class LastOccurance {
    public static int func(int arr[], int key, int i)
    {
        if(i<0)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return func(arr, key, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int arr[] = {1,2,3,8,5,1,5};
        System.out.println(func(arr, 5, arr.length-1));
    }
}
