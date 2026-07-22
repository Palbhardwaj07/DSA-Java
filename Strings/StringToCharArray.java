package Strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Pal";
        char[] arr = s.toCharArray();     // This is called as camel case
        for(char ch : arr){
            System.out.println(ch);
        }
    }
}
