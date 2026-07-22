package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        int lo = 0, hi = n-1;
        int idx = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target) {
                idx = mid;
                lo = mid + 1;
            }
            else if(arr[mid] < target) lo = mid + 1;
            else hi = mid - 1; 
        }
        System.out.print("Found at index " + idx);
    }
}
