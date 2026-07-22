package MultiDimensionalArrays;

import java.util.Scanner;

public class MatrixInSnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){ 
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
            }  
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
