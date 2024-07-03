package tomiks.task.six.figures;

public class Triangle extends Figure {
    private double A;
    private double B;
    private double C;

    public Triangle(double a, double b, double c, double x, double y) throws Exception {
        super(new Point(x, y), "Треугольник");

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("Not valid triangle");
        }

        A = a;
        B = b;
        C = c;
    }

    @Override
    public double area() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    public double perimeter() {
        return A + B + C;
    }
}
