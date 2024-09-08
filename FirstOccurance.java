import java.util.Scanner;

public class FirstOccurance {
    public static int func(int arr[], int key, int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return func(arr, key, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int arr[] = {1,2,3,8,4,7,6,5};
        System.out.println(func(arr, 5, 0));
    }
    
}
