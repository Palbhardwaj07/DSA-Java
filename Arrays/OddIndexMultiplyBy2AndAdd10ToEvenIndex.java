package Arrays;
import java.util.Scanner;

public class OddIndexMultiplyBy2AndAdd10ToEvenIndex {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
           }

           for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] +=10;
            }
            else{
                arr[i] *= 2;
            }
           }
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
           }
    }
}
