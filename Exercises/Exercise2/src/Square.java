class Square extends Shape {
    private double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}