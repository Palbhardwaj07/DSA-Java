package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpirallyTraversingAMatrix {

    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;
        // int tne = m*n;
        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {     // While(ans.size()<tne){}

            // Top row
            for (int j = firstCol; j <= lastCol; j++) {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            if (firstRow > lastRow || firstCol > lastCol) break;     // if(ans.size()==tne) break;

            // Right column
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(arr[i][lastCol]);
            }
            lastCol--;

            if (firstRow > lastRow || firstCol > lastCol) break;

            // Bottom row
            for (int j = lastCol; j >= firstCol; j--) {
                ans.add(arr[lastRow][j]);
            }
            lastRow--;

            if (firstRow > lastRow || firstCol > lastCol) break;

            // Left column
            for (int i = lastRow; i >= firstRow; i--) {
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        SpirallyTraversingAMatrix obj = new SpirallyTraversingAMatrix();
        System.out.println(obj.spiralOrder(arr));
    }
}