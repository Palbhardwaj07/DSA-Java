package MultiDimensionalArrays;

import java.util.Scanner;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i=0;i<4;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);

        // Transpose
        for(int i=1;i<arr.length;i++){  
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each row
        for(int i=0;i<arr.length;i++){
            int stcol = 0, endcol = arr[0].length - 1;
            while(stcol<endcol){
                int temp = arr[i][stcol];
                arr[i][stcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                stcol++;
                endcol--;
            }
        }
        print(arr);
    }
    public static void print(int[][] arr) {
    for(int[] a : arr){
        for(int ele : a){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    }
}
