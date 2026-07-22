package OOPS;

class Cricketer{
    final String country = "India";     // fixed, cannot be changed
    // static String country = "India"; 
    int  runs;
    String name;
    double avg;
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        // c1.country = "England";     // Gives error
        System.out.println(c1.country);
    }
}
