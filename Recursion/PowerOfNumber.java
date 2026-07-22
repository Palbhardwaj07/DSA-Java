package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==10) System.out.println(10);
        System.out.println(pow(n,n));
    }

    public static int pow(int a, int b) {
        if(b==0) return 1;
        int call = pow(a, b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}
