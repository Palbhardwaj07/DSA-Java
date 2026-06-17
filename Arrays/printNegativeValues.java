package Arrays;

import java.util.Scanner;

public class printNegativeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // Printing Negative Values
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.println(arr[i] + " ");
        }
    }
}
