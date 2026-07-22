package OOPS;

class ComplexNumber{
    double x;
    double y;
    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }

    ComplexNumber(){}

    void print(){
        if(y>=0) System.out.println(x + " + " + y + "i");
        else System.out.println(x + " - " + (-y) + "i");
    }

    void add(ComplexNumber z){
        x+=z.x;
        y+=z.y;
    }

    void sub(ComplexNumber z){
        x-=z.x;
        y-=z.y;
    }

    void multiply(ComplexNumber z) {
        double real = x;
        double imag = y;

        x = real * z.x - imag * z.y;
        y = real * z.y + imag * z.x;
    }

    void divide(ComplexNumber z){
        double real = x;
        double imag = y;

        double denominator = z.x * z.x + z.y * z.y;

        if (denominator == 0) {
            System.out.println("Division by zero is not possible.");
            return;
        }

        x = (real * z.x + imag * z.y) / denominator;
        y = (imag * z.x - real * z.y) / denominator;
    }
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3,4);
        z1.print(); 
        z2.print();

        z1.add(z2);
        z1.print();

        z1.sub(z2);
        z1.print();

        z2.multiply(z1);
        z2.print();

        z2.divide(z1);
        z2.print();
    }
}
