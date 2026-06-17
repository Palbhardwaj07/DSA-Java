package Methods;

import java.util.Scanner;

public class PermutationAndCombination {

    public static int fact(int x){
        int f = 1;
        for(int i=1;i<=x;i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(r);

        System.out.println("Combination is " +ncr);
        System.out.println("Permutation is " +npr);
    }
}
