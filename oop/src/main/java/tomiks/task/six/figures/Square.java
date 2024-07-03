package tomiks.task.six.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, double x, double y) {
        super(new Point(x, y), "Квадрат");

        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
