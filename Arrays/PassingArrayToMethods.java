package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};     
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x) {     // Reference Variable
        x[2] = 60;     // Pass By Reference
    }
}