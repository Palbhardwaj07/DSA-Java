package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        // 2 Variable Or 2 Pointer Technique

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length;
        int i=0, j=l-1;     // For Particular Part Give That Particular Index
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // for(int i=0;i<arr.length/2;i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        for(int ele : arr) System.out.print(ele + " ");
    }
}
