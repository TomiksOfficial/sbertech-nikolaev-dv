package tomiks.task.two;

public class Circle {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Radius: %.2f\nColor: %s\nSquare: %.2f\nPerimeter: %.2f", radius, color, area(), perimeter());
    }
}
