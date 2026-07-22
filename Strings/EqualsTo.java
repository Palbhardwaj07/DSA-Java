package Strings;

public class EqualsTo {
    // public static boolean equals(String s1, String s2) {
    //     if(s1.length()!=s2.length()) return false;
    //     for(int i=0;i<s1.length();i++){
    //         if(s1.charAt(i)!=s2.charAt(i)) return false;
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
        // String s1 = "Pal";
        // String s2 = "Pal";
        // System.out.println(s1==s2);

        String s1 = new String("Pal");
        String s2 = new String("Pal");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
