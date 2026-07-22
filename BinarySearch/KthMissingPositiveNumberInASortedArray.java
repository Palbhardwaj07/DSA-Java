package BinarySearch;

import java.util.Scanner;

public class KthMissingPositiveNumberInASortedArray {

    public static int kthMissing(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if (missing >= k)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return hi + 1 + k;
    }
    public static void main(String[] args) {
        // Given a sorted array of distinct positive integers arr[], You need to find the kth positive number that is missing from the arr[].
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthMissing(arr, k));
    }
}





