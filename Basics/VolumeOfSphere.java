import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Volume of sphere is "+(4/3)*3.14*r*r*r);
    }
}
