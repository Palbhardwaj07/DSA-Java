package Arrays;

import java.util.Scanner;

public class MinElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // Min Element
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) 
                min = arr[i];
        }
        System.out.println(min);
    }
}