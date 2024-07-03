package tomiks.task.six.utils;

public enum Color {

    RED("Красный"),
    BLUE("Синий"),
    PURPLE("Фиолетовый"),
    YELLOW("Жёлтый"),
    GREEN("Зелёный"),
    BLACK("Чёрный"),
    WHITE("Белый");


    private final String title;

    Color(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
