package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SingleAmongDoublesInASorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 

        if(n == 1) {System.out.println(arr[0]); return;}
        if(arr[0] != arr[1]) { System.out.println(arr[0]); return;}
        if(arr[n-1] != arr[n-2]) {System.out.println(arr[n-1]); return;}
        int lo = 0, hi = n - 1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {System.out.println(arr[mid]); return; }
            int f = mid, s = mid;
            if(arr[mid - 1] == arr[mid]) f = mid - 1;
            else s = mid + 1;
            int leftcount = f - lo;
            int rightcount = hi - s;
            if(leftcount % 2 == 0) lo = s + 1;
            else if(rightcount % 2 == 0) hi = f - 1;
        }  
        System.out.println("-1");
}
}
