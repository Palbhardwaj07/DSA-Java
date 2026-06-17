package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Output
        int[] arr = {1,3,5,7,9};
        System.out.println(arr.length);
        // for(int i=0;i<5;i++){
        //     System.out.print(arr[i] + " ");
        // }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        // Default Values
        int[] x = new int[6];
        for(int i=0;i<x.length;i++){
            System.out.print(x[i] + " ");
        } 

        // Input
        for(int i=0;i<x.length;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<x.length;i++){
            System.out.print(x[i] + " ");
        }
    }
}
