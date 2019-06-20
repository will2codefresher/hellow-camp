package hellow.camp;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double circumference() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }
}
