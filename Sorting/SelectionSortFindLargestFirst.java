package Sorting;

import java.util.Scanner;

public class SelectionSortFindLargestFirst {

   public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 

        // Selection Sort
        for(int i=n-1;i>=1;i--){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j=0;j<=i;j++){
                if(arr[j]>max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
        print(arr);
    }
}
