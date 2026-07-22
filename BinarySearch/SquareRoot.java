package BinarySearch;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Brute Force Approach
        // T.C. = O(sqrt(n))
        // int root = 0;
        // for(int i=1;i<=n;i++){
        //     if(i*i>n) break;
        //     root = i;
        // }
        // System.out.println(root);

        // Binary Search
        long lo = 1, hi = n;
        while(lo <= hi){
            long mid = (lo+hi)/2;
            if(mid*mid == n) {System.out.println((int)mid); return;}
            else if(mid*mid>n) hi = mid - 1;
            else lo = mid + 1;
        }
        System.out.println((int)hi);

        // 2nd Method

        if(n==0) return ;
        int lo = 1, hi = n;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(mid == n/mid) {System.out.println(mid); return;}
            else if(mid>n/mid) hi = mid - 1;
            else lo = mid + 1;
        }
        System.out.println(hi);
    }
}
