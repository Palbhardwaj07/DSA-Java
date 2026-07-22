package MultiDimensionalArrays;

import java.util.Scanner;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){
            if(matrix[i][j] > target) j--;
            else if(matrix[i][j] < target) i++;
            else return true;
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        SearchA2DMatrix obj = new SearchA2DMatrix();
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println(result);
    }
}