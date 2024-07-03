package tomiks.task.six.figures;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Точка: [x=%.2f, y=%.2f]\n", x, y);
    }
}
