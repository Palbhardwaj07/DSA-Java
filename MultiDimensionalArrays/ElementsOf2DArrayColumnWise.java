package MultiDimensionalArrays;

import java.util.Scanner;

public class ElementsOf2DArrayColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr[0].length;i++){  
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i] + " ");     
            }
            System.out.println();
        }
    }
}
