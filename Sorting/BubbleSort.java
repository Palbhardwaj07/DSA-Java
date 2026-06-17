package Sorting;

import java.util.Scanner;
public class BubbleSort {

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
        // print(arr);

        // Bubble Sort
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
        }
    }


    // Bubble Sort Optimised
    for(int i=0;i<arr.length-1;i++){
        // boolean isSorted = true;
        // for(int j=0;j<n-1;j++){
        //     if(arr[i]>arr[j+1]){
        //         isSorted = false;
        //         break;
        //     }
        // }
        // if(isSorted == true) break;
        int swaps = 0;
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
                swaps++;
            }
        }
        if(swaps == 0) break;
    }

    print(arr);
    }
}
