package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 

        //Two Sum
        int target = sc.nextInt();
        Arrays.sort(arr);
        int i=0, j=arr.length - 1;
        while(i<j){
            if(arr[i] + arr[j] == target) {System.out.println("Found"); return;}
            else if(arr[i] + arr[j] > target) j--;
            else if(arr[i] + arr[j] < target) i++;
        }
        System.out.println("Not Found");
    }

}
