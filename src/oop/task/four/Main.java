package oop.task.four;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Useless progression",
                         new Author("Alex", "Mitucheli",
                        true,
                        "mitalex@yandex.ru"), 2002);

        System.out.println(book);
    }
}
