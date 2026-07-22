package BinarySearch;

import java.util.Scanner;

public class MaximumCountOfPositiveAndNegativeInteger {

    // Returns index of first element >= 0
    public static int firstNonNegative(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= 0) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    // Returns index of first element > 0
    public static int firstPositive(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static int maximumCount(int[] nums) {
        int neg = firstNonNegative(nums);
        int pos = nums.length - firstPositive(nums);
        return Math.max(neg, pos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumCount(nums));
    }
}

