package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        // StringBuilder s = new StringBuilder("Pal");
        System.out.println(s.length() + " " + s.capacity());
        s.append("Pal");
        System.out.println(s);
        System.out.println(s.length() + " " + s.capacity());
        s.setCharAt(1, 'o');     // T.C. - O(1)
        System.out.println(s);
        String str = s.toString();
        System.out.println(str);
    }
}
