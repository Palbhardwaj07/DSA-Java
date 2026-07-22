import java.util.Scanner;

public class PrimeAndCompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
    }
    if(flag == false) System.out.println("Composite No.");
    else System.out.println("Prime No.");
}
}
