package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public List<List<Integer>> generate(int n) {
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
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PascalTriangle obj = new PascalTriangle();
        List<List<Integer>> result = obj.generate(n);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

