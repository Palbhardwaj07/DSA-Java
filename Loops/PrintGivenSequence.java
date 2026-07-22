import java.util.Scanner;

public class PrintGivenSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1 n 2 n-1 3 n-2...

        int end = n;
        for(int start=1;start<=end;start++,end--){
            System.out.println(start);
            if(start!=end){
                System.out.println(end);
            }
        }
    }
}
