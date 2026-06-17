import java.util.Scanner;

public class TSAOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("TSA Of Cuboid "+2*(l*b+b*h+l*h));

    }
}
