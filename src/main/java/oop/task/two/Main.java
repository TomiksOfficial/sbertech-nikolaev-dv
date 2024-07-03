package oop.task.two;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.2, "Red");

        System.out.println("Square: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println(circle);
    }
}
