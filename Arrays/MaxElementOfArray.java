package Arrays;

import java.util.Scanner;

public class MaxElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // Max Element
        int max = arr[0];
        // int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) 
                max = arr[i];
        }
        System.out.println(max);
    }
}
