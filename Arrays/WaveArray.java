package Arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        
        // Given an sorted array arr[] of integers. Sort the array into a wave-like array(In Place). In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5] ..... and so on. If there are multiple solutions, find the lexicographically smallest one.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i=i+2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
