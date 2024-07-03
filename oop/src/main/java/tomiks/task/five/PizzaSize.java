package tomiks.task.five;

public enum PizzaSize {
    SMALL("Маленькая"),
    MEDIUM("Средняя"),
    BIG("Большая");

    private String sizeName;

    PizzaSize(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getSizeName() {
        return sizeName;
    }
}
