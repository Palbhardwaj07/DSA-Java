package Arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {

        // Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
