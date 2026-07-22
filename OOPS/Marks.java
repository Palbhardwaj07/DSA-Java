package OOPS;
import java.util.*;
public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){     // int[] s
            marks = new int[s]; // marks = Arrays.copyOf(s,s.length);     // Deep copy
        }
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);     // Deep copy
        }
    }
    public static void main(String[] args) {
        int[] arr = {98, 44, 78, 45};
        // StudentData s1 = new StudentData(4);   
        StudentData s1 = new StudentData(arr);  
        s1.marks[0] = 78;     // Shallow copy  
        System.out.println(arr[0]);

        StudentData s2 = new StudentData(2);
        s1.marks[0] = 98;
        s1.marks[1] = 95;
    }
}
