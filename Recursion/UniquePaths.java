package Recursion;

import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(paths(m, n));
    }

    // public static int paths(int m, int n) {
    //     if(m==1 || n==1) return 1;
    //     return paths(m-1,n) + paths(n,n-1);
    // }  

    // public static int paths(int cr, int cc, int lr, int lc) {
    //     if(cr==lr && cc==lc) return 1;
    //     if(cr>lr || cc>lc) return 0;     // Important 
    //     int right = paths(cr, cc+1, lr, lc);
    //     int down = paths(cr+1, cc, lr, lc);
    //     return right + down;
    // }

    // public static int uniquepaths(int m, int n) {
    //     return paths(0, 0, m-1, n-1);
    // }

    public static int uniquepaths(int m, int n) {
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;     
        return uniquepaths(m, n-1) + uniquepaths(m-1, n);
    }
}
  