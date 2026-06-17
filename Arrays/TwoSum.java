package Arrays;
import java.util.Scanner;
public class TwoSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    flag = true;
                    System.out.println("Found");
                }
            }
        }
        if(!flag) System.out.println("Not Found");
     }
}
