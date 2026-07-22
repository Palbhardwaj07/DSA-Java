package OOPS;

class Students{
    // Encapsulation - Data hiding
    String name;     // Default value - null
    private int rno;     // Default value - 0
    double cgpa;     // // Default value - 0.0
    void print(){
        System.out.println(name + " " + cgpa + " " + rno);
    }
    // public void p(){     // We have used this so that we can use private function. If the function was not private then that function could be directly used.
    //     print();
    // }
    int getRno(){     // getter
        return rno;
    }
    void setRno(int x){     // setter
        rno = x;
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        // System.out.println(s1.cgpa);
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Pal";
        // s1.rno = 12;  --  Not possible as it is declared as private
        s1.setRno(25);
        System.out.println(s1.getRno());
        // s1.print();

    }
}
