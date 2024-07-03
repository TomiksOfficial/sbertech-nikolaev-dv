package oop.task.six.figures;

import oop.task.six.utils.Color;

public abstract class Figure implements Drawable {
    public Point point;

    private String title = "Неопределённая фигура";

    public abstract double area();

    public abstract double perimeter();

    public Figure(Point point, String title) {
        this.point = point;
        this.title = title;
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: %s\n%s", title, point);
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Фигура: %s\nЦвет: %s\n%s", title, color.getTitle(), point);
    }
}
