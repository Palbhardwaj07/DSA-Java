package  BinarySearch;

import java.util.Scanner;

public class ArrangeCoins {

    public static long sqrt(long n) {
        if (n == 0) return 0;
        long lo = 1, hi = n;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid == n / mid)
                return mid;
            else if (mid > n / mid)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return hi;
    }
    public static int arrangeCoins(int n) {
        long m = n;
        return (int) ((sqrt(8 * m + 1) - 1) / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
}

