package tomiks.task.five;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Эль-Памелло", PizzaSize.MEDIUM, true, "Козлёнская 33");

        order.order();
        order.cancel();

        System.out.println(order);
    }
}
