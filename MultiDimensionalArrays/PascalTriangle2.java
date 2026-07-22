package MultiDimensionalArrays;

package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.get(i).add(1);
                } else {
                    int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans.get(rowIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowIndex = sc.nextInt();
        PascalTriangle2 obj = new PascalTriangle2();
        List<Integer> result = obj.getRow(rowIndex);
        System.out.println(result);
    }
}



