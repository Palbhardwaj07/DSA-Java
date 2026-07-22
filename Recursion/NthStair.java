package Recursion;

import java.util.Scanner;

public class NthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
    // T.C. - O(2^n)
    public static int stair(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        return stair(n-1) + stair(n-2);
    }
}
