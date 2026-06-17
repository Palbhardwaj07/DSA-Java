package Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        int d = sc.nextInt();
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,l-1);
        reverse(arr,0,l-1);
        for(int ele : arr) System.out.print(ele + " ");
    }
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
