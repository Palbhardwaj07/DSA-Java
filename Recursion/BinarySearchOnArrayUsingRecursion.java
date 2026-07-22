package Recursion;

import java.util.Scanner;

public class BinarySearchOnArrayUsingRecursion {
    public static void main(String[] args) {

        // T.C. - O(n)
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }
    
    public static int search(int[] arr, int target) {
        int n = arr.length;
        return helper(arr, target, 0, n-1);
    }

    public static int helper(int[] arr, int target, int lo, int hi) {
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return helper(arr, target, lo, mid-1);
        else return helper(arr, target, mid+1, hi);
    }
}
