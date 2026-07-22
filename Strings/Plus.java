package Strings;

public class Plus {
    public static void main(String[] args) {
        String s = "Pal";   
        // s = s + " Bhardwaj";
        s += " Bhardwaj";     // String
        s += 7;     // Number
        s += 'a';     // Character
        // s -= 'a' This does not work
        s += '\n';
        s += 'a';
        s += '\0';
        System.out.println(s);
        System.out.println("Pal" + 20 + 10);     // Left to right
        System.out.println(10 + 20 + "Pal");
        System.out.println(10 + "Pal" + 20);
        System.out.println('A' + 2 + "Pal");
    }
}
