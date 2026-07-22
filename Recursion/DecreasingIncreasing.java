package Recursion;

import java.util.Scanner;

public class DecreasingIncreasing {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
    }
    public static void print(int n) {
        if(n==0) return;
        // for 1 only once 
        // if(n==1){
        //     System.out.print(n + " ");
        //     return;
        // }
        System.out.println(n);
        print(n-1);

        // if(n!=1)     // Another way of printing 1 only once
        System.out.println(n);
    }
}
