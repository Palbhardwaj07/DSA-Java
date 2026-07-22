package Strings;
public class BuiltInMethods {
    public static void main(String[] args) {
          String s = "Pal Bhardwaj";
          System.out.println(s.indexOf('a'));
          System.out.println(s.lastIndexOf('a'));
          // Can only find first and last by default
          // If not present then -1
          System.out.println(s.toLowerCase());
          System.out.println(s.toUpperCase());
          System.out.println(s.contains("Bhar"));
          if(s.contains("Pa")) System.out.println("Happy");
          System.out.println(s.startsWith("Bhar"));
          System.out.println(s.endsWith("aj"));

          String str = "12345678";
          int n = Integer.parseInt(str);     // String to int
          System.out.println(n);
    }
 }
