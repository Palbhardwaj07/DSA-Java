package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorInASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.
        
        int tar = sc.nextInt();
        int idx = -1;
        int lo = 0, hi = n-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] > tar) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        System.out.print(idx);
    }
}