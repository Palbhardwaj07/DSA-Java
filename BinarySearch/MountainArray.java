package BinarySearch;

import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int lo = 1, hi = n-2;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid-1]) {System.out.print("Peak found at index " + mid); return;}
            else if(arr[mid] < arr[mid + 1] && arr[mid] > arr[mid-1]) lo = mid + 1;
            else hi = mid - 1; 
        }
        System.out.println("Not Found");
    }
}
