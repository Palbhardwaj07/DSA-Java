package CyclicSort;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = arr.length + 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == missing) {
                i++;
            } else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(missing);
    }
}
