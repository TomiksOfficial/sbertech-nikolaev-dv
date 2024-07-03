package tomiks.task.six.figures;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width, double x, double y) {
        super(new Point(x, y), "Прямоугольник");

        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return height * 2 + width * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
