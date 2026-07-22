package Recursion;

import java.util.Scanner;

public class ARaisedToThePowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(Math.pow(a,b));     Built In function 
        System.out.println(pow(a,b));
    }
    // public static int pow(int a, int b) {
    //     if(b==0) return 1;
    //     return a*pow(a, b-1);
    // }

    public static int pow(int a, int b) {
        if(b==0) return 1;
        int call = pow(a, b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}
