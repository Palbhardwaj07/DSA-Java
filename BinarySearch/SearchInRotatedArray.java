package BinarySearch;
import java.util.Scanner;

public class SearchInRotatedArray {

    static int search(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == key)
                return mid;
            // Left half is sorted
            if (arr[lo] <= arr[mid]) {
                if (arr[lo] <= key && key < arr[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            // Right half is sorted
            else {
                if (arr[mid] < key && key <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key to search
        int key = sc.nextInt();
        int ans = search(arr, key);
        System.out.println(ans);
    }
}

