package Arrays;

import java.util.Scanner;

public class Segregate0And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }

        // 2 Pass Solution
        int NumberOfZeros = 0;
        int NumberOfOnes = 0;
        for(int ele : arr){
            if(ele == 0) NumberOfZeros++;
            else NumberOfOnes ++;
        }
        for(int i=0;i<arr.length;i++){
            if(i < NumberOfZeros){
                arr[i] = 0;
            }
            else arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        // 2 Pointer Solution
        int i = 0, j = n-1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j++;
            //if(i>j) break;
            else if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

    }
}
