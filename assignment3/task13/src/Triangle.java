import java.math.MathContext;
public class Triangle {
    double a;
    double b;
    double c;

    public void perimeter(){
        double peri = a+b+c;
        System.out.println("Perimeter = "+peri);
    }

    public void area(){
        double halfperi = (a+b+c)/2;
        double area1 = Math.sqrt(halfperi*(halfperi-a)*(halfperi-b)*(halfperi-c));
        System.out.println("Area = "+area1);
    }
}
