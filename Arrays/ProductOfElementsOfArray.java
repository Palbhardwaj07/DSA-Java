package Arrays;

import java.util.Scanner;

public class ProductOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // Product Of Elements
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}