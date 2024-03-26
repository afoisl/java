package March.Java0326Ex;

public class Triangle implements Shape {
    private double length;

    private double height;

    public Triangle() {
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * 3;
    }

    @Override
    public double calculatePerimeter() {
        return length * height / 2;
    }
}
