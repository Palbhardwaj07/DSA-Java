import java.util.Scanner;

public class Magniude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<69 && n>-69) System.out.println("Magnitude is smaller than 69");
        else System.out.println("Magnitude is not smaller than 69");
    }
}
