package Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        boolean flag = false;
        // int found = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag = true;
                // found = i;
                break;
            }
        }
        if(flag == true) System.out.println("Yes");
        // if(found!=-1) System.out.println("Target found at index " + found);
        else System.out.println("No");
    }
}