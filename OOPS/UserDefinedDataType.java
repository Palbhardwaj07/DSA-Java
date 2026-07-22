package OOPS;

import java.util.Scanner;
// class Student{
//         String name;
//         int rno;
//         double cgpa;
//     }
public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;

        void print(){
            System.out.println(name + " " + rno + " " + cgpa);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Khushi";
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student();
        s3.name = "Anagha";
        s3.rno = sc.nextInt();
        s3.cgpa = 9.37;

        System.out.println(s1.name + " " + s1.cgpa + " " + s1.rno);
        s2.cgpa = 9.8;
        System.out.println(s3.rno);

        s1.print();
        s2.print();
        s3.print();

       }
}
