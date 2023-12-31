import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("a = ");
        triangle.a = scanner.nextInt();

        System.out.print("b = ");
        triangle.b = scanner.nextInt();

        System.out.print("c = ");
        triangle.c = scanner.nextInt();

        triangle.perimeter();
        triangle.area();
        scanner.close();
    }
}