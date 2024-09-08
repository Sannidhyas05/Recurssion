import java.util.Scanner;

public class Sorted {
    public static boolean array(int arr[], int i)
    {
        if(arr[i]== arr.length)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return array(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int arr[] = {1,2,3,8,4};
        System.out.println(array(arr, 0));
    }
}
