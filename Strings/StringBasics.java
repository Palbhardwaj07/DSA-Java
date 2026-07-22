package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "Hi, I'm Pal";
        String s = sc.nextLine();
        System.out.println(s);
        String str = sc.next();
        System.out.println(str);
        System.out.println(str.charAt(1));     // s[4];
        System.out.println(str.length());     // Length of string (Space is counted as character)
    }
}
