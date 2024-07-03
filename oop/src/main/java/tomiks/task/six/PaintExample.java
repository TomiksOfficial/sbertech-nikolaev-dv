package tomiks.task.six;

import tomiks.task.six.figures.Circle;
import tomiks.task.six.figures.Rectangle;
import tomiks.task.six.utils.Color;
import tomiks.task.six.utils.FigureUtil;

public class PaintExample {

    public static void main(String[] args) {

        Circle circle = new Circle(5.3, 1, 3);

        circle.draw();
        circle.draw(Color.BLACK);

        Rectangle rect = new Rectangle(5, 3, 7,  2);

        rect.draw();
        rect.draw(Color.WHITE);

        FigureUtil.draw(rect);
        FigureUtil.draw(circle, Color.PURPLE);

    }
}
