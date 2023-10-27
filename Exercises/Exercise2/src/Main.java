abstract class Shape{
    private static String color;

    public static String className = "Shape";

    public Shape() {}
    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    public static void setColor(String newColor) {
        color = newColor;
    }
    public static String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape.setColor("blue");

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Color: " + Shape.getColor());

        Square square = new Square(5);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
        System.out.println("Square Color: " + Shape.getColor());

        Triangle triangle = new Triangle(4, 4, 4);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Color: " + Shape.getColor());

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Color: " + Shape.getColor());
    }
}



