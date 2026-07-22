package MultiDimensionalArrays;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i=0;i<4;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);

        // For square matrix transpose same matrix
        for(int i=1;i<arr.length;i++){  
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        
        // For rectangle matrix i.e. creating another matrix
        int row = arr.length, col = arr[0].length;
        int[][] b = new int[row][col];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j] = arr[j][i];
            }
        }
        print(b);

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
