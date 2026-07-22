package CyclicSort;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i<n) {
            int rightIndex = arr[i] - 1;
            if(arr[i] == i+1 || arr[rightIndex] == arr[i]) i++;
            else{
                int temp = arr[i];
                arr[i] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
        }
        for(i=0;i<n;i++){
            if(arr[i] != i+1) ans.add(arr[i]);
        }
        System.out.println(ans);
    }
}
