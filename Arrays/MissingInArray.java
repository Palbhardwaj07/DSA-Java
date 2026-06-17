package Arrays;

import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
    
        int sum = n*(n+1)/2;
        int arraysum = 0;
        for(int ele : arr){
            arraysum += ele;
        }
        System.out.println(sum - arraysum);
    }
}
