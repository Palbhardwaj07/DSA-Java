package Recursion;

import java.util.Scanner;

public class SearchOnArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();

        System.out.println(exists(arr, ele, 0));
    }
    
    public static boolean exists(int[] arr, int ele, int idx) {
        if(idx == arr.length) return false;
        if(arr[idx] == ele) return true;
        return exists(arr, ele, idx+1);
    }
}
