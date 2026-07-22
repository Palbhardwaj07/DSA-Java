package MultiDimensionalArrays;

import java.util.Scanner;

public class InputAndOutputIn2DArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4]; 
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,8,7,6}};
        // System.out.println(arr.length);     // No of rows
        // System.out.println(arr[0].length);     // No of columns

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        // Input
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0;i<3;i++){     // i<arr.length
            for(int j=0;j<4;j++){     // j<arr[0].length
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
