import java.io.Serializable;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semi = (sideA + sideB + sideC) / 2;
        double areaSquare = (semi * (semi - sideA) * (semi - sideB) * (semi - sideC));
        return Math.sqrt(areaSquare);
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
