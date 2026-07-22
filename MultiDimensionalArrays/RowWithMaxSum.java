package MultiDimensionalArrays;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for(int i=0;i<3;i++){     
            for(int j=0;j<4;j++){     
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0;i<arr.length;i++){  
            int sum = 0;   
            for(int j=0;j<arr[0].length;j++){
                sum += arr[i][j];     
            }
            if(sum>maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("Row is " + row + " Sum is " + maxSum);
    }
}
