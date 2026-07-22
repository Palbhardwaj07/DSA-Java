package OOPS;

public class Constructors {
     public static class Car{
        int seats;
        String name;
        double length;
        Car(){     // Default Constructor

        }

        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;
        }

        // We two constructor are formed as done above of the same name but different parameter it is known as constructor overloading. Similarly we have method overloading.
        // Order matter in constructor.
        void print(){
            System.out.println(seats + " " + name + " " + length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5, "Kia Sonet", 3.99);
        c1.print();
        Car c2= new Car(4, "Lord Alto", 3.75);
        c2.print();

        Car c3 = new Car();     // To make this work form default constructor
        c3.name = "Honda Amaze"; 
        Car c4 = c1;     // c4 is shallow copy of c1 (can control)
    }
}
