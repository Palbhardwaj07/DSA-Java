package Strings;

public class PassingStringToMethod {

    public static void change(String x) {
        x = "Bhardwaj";
    }
    public static void main(String[] args) {
        String x = "Pal";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
