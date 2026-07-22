package MultiDimensionalArrays;

import java.util.Scanner;

public class MaxElementOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.print(max);
    }
}
