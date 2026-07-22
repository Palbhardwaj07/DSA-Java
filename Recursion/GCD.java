package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b) {
        // int hcf = 1;
        // for(int i=Math.min(a, b); i>=i; i--){     // for(int i=0; i<=Math.min(a, b); i++){
        //     if(a%i==0 && b%i==0){
        //         return i;     // hcf = i;
        //     }
        // }
        // return 1;     // return hcf;

        if(a==0) return b;
        return gcd(b%a, a);
    }

    // public static int gcd(int a, int b) {
    //     return helper(Math.min(a,b), Math.max(a,b));
    // }

    // public static int helper(int a, int b) {
    //     if(a==0) return b;
    //     return gcd(b%a, a);
    // }

}
