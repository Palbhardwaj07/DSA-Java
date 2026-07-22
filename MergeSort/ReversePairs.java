package MergeSort;

import java.util.Scanner;

public class ReversePairs {
    int count = 0;
    public int reversePairs(int[] nums) {
        MergeSort(nums);
        return count;
    }

    public void MergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        MergeSort(a);
        MergeSort(b);
        countPairs(a, b);
        merge(a, b, arr);
    }

    public void countPairs(int[] a, int[] b) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            while (j < b.length && (long) a[i] > 2L * b[j]) {
                j++;
            }
            count += j;
        }
    }

    public void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }
        while (i < a.length)
            arr[k++] = a[i++];
        while (j < b.length)
            arr[k++] = b[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        ReversePairs obj = new ReversePairs();
        int ans = obj.reversePairs(nums);
        System.out.println(ans);
    }
}