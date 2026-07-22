package Recursion;

public class GlobalVariables {

    static int x = 10;
    public static void main(String[] args) {
        // int x =10;
        // change(x);
        fun();
        System.out.println(x);
    }
    public static void fun() {
        x = 20;
        // System.out.println(x);
    }
}
