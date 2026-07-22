package BinarySearch;

import java.util.Scanner;

public class SearchInSortedMatrix {

    public static boolean searchMatrix(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;
        int lo = 0;
        int hi = rows * cols - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midRow = mid / cols;
            int midCol = mid % cols;
            if (mat[midRow][midCol] == x)
                return true;
            else if (mat[midRow][midCol] > x)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // Element to search
        int x = sc.nextInt();
        System.out.println(searchMatrix(mat, x));
    }
}
