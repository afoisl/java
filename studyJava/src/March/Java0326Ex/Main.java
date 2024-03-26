package March.Java0326Ex;

public class Main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 3);
            System.out.println("Area: " + rectangle.calculateArea());
            System.out.println("Perimeter: " + rectangle.calculatePerimeter());
            Circle circle = new Circle(5);
            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Perimeter: " + circle.calculatePerimeter());
            Triangle triangle = new Triangle(5,5);
            System.out.println("Area: " + triangle.calculateArea());
            System.out.println("Perimeter: " + triangle.calculatePerimeter());
        }
    }

