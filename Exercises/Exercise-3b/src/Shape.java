import java.io.Serializable;

public abstract class Shape implements Serializable {
    private static String color;

    public static String className = "Shape";

    public Shape() {
    }

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