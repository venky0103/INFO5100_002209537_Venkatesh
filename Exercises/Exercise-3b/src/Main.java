import java.io.Serializable;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Shape.setColor("blue");


        Circle circle = new Circle(7);
        SerializationDemo.serialize(circle, "circle.ser");
        Circle deserializedCircle = null;
        try {
            deserializedCircle = (Circle) SerializationDemo.deserialize("circle.ser");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (deserializedCircle != null) {
            System.out.println("Deserialized Circle Area: " + deserializedCircle.calculateArea());
            System.out.println("Deserialized Circle Perimeter: " + deserializedCircle.calculatePerimeter());
            System.out.println("Deserialized Circle Color: " + Shape.getColor());
        }

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