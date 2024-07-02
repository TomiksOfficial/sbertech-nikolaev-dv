package oop.task.one;

public class Phone {

    private final String number;
    private final String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = -1;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("Звонит %s | %s\n", name, number);
    }

    public void sendMessage(String[] numbers) {
        System.out.println(String.join("\n", numbers));
    }

    @Override
    public String toString() {
        return String.format("Number: %s\nModel: %s\nWeight: %d", number, model, weight);
    }
}
