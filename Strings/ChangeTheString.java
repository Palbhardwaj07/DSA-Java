package Strings;

import java.util.Scanner;

public class ChangeTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (Character.isUpperCase(s.charAt(0))) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}

