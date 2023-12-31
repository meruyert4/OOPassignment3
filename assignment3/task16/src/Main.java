public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        System.out.println("Square:");
        System.out.println("side length: " + square.getSideLength());
        System.out.println("squares area: " + square.calculateArea());
        System.out.println("squares perimeter: " + square.calculatePerimeter());
        System.out.println();

        System.out.println("Cirlce:");
        Circle circle = new Circle(3.0);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("circles area: " + circle.calculateArea());
        System.out.println("circles perimeter: " + circle.calculatePerimeter());
    }

}