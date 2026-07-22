package MultiDimensionalArrays;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }

        // for(int i=0;i<arr.length;i++){
        //     for(int ele : arr[i]){
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }

        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
