package CyclicSort;

import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (i<n) {
            if(arr[i] == i) i++;
            else{
                int idx = arr[i];
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
