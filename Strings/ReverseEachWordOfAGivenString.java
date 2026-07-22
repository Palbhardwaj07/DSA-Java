package Strings;

import java.util.Scanner;

public class ReverseEachWordOfAGivenString {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder rev = new StringBuilder(words[i]);
            ans.append(rev.reverse());
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
}