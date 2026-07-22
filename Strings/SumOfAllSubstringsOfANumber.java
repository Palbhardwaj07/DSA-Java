package Strings;

import java.util.Scanner;

public class SumOfAllSubstringsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                sum += Integer.parseInt(sub);
            }
        }

        System.out.println(sum);
    }
}
