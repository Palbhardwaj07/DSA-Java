import java.util.Scanner;

public class SumOfNoAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int o = n;
        int r = 0;
        while(n != 0){
            r *= 10;
            r += n%10;
            n /= 10;
        }
        System.out.println("Reverse = " + r);
        System.out.println("Sum = " + (o+r));
    }
}