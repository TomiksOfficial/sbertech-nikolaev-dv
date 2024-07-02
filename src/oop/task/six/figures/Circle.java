package oop.task.six.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, double x, double y) {
        super(new Point(x, y), "Круг");
        this.radius = radius;


    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
