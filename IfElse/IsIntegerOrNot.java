import java.util.Scanner;

public class IsIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0) System.out.println("Is Integer");
        else System.out.println("Not an Integer");
    }
}
