package CyclicSort;

import java.util.Scanner;

public class FindTheDuplicateNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int correct = arr[i] - 1;
                if (arr[i] == arr[correct]) {
                    System.out.print(arr[i]);
                    return;
                }
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
        System.out.print(-1);
    }
}

