package oop.task.one;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("+79623462534", "Redmi");
        System.out.println(phone);
        System.out.println(phone.getNumber());
        phone.receiveCall("Mihail");
        phone.sendMessage(new String[] {
            "+796426722312",
            "+796785454567",
            "+79435562371"
        });
    }

}
