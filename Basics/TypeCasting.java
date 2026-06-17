public class TypeCasting {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch;              // Implict Typecasting
        System.out.println(x); 
        
        char chh = 'a';
        int y = (int)chh;       // Explicit Typecasting
        System.out.println(y);
        System.out.println(chh+1);

        // Integer to Character
        int a = 70;
        System.out.println((char)a);

    }
}
