package Recursion;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a,b));
    }

    public static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    public static int gcd(int a, int b) {
        return helper(Math.min(a,b), Math.max(a,b));
    }

    public static int helper(int a, int b) {
        if(a==0) return b;
        return gcd(b%a, a);
    }

}