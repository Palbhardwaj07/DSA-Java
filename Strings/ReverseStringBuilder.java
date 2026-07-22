package Strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        // String s = "Pal";
        // StringBuilder sb = new StringBuilder(s);
        //sb.reverse();
        // int i=0, j=sb.length() - 1;
        // while(i<=j){
        //     char temp1 = sb.charAt(i);
        //     char temp2 = sb.charAt(j);
        //     sb.setCharAt(i,temp2);
        //     sb.setCharAt(j,temp1);
        //     i++;
        //     j--;
        // } 
        // System.out.println(sb);

        // sb.deleteCharAt(1);     // T.C. - O(n)
        // System.out.println(sb); 

        // sb.insert(1, 'a');
        // System.out.println(sb);

        // sb.delete(1, 3);
        // System.out.println(sb );

        // To reverse string
        String s = "Bhardwaj";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);

    }
}
