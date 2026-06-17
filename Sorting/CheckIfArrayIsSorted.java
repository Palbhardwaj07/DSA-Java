package Sorting;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            System.out.println("False");
            break;
    }
    System.out.println("True");
    }
}
}
