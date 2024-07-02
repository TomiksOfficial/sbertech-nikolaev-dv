package oop.task.five;

public class PizzaOrder {

    private String title;
    private PizzaSize size;
    private boolean isSauceNeed;
    private String address;
    private boolean isAccept;

    public PizzaOrder(String title, PizzaSize size, boolean isSauceNeed, String address) {
        this.title = title;
        this.size = size;
        this.isSauceNeed = isSauceNeed;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String acceptStatusStringify() {
        if (isAccept) {
            return "Принят";
        } else {
            return "Не принят";
        }
    }

    public String sauceNeedStringify() {
        if (isSauceNeed) {
            return "с соусом";
        } else {
            return "без соуса";
        }
    }

    public boolean isSauceNeed() {
        return isSauceNeed;
    }

    public void setSauceNeed(boolean sauceNeed) {
        isSauceNeed = sauceNeed;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void order() {
        if (isAccept) {
            System.out.println("Заказ уже принят");
        } else {
            isAccept = true;
            System.out.printf("Заказ принят. %s пицца '%s' %s на адрес %s\n", size.getSizeName(), title, sauceNeedStringify(), address);
        }
    }

    public void cancel() {
        if (isAccept) {
            isAccept = false;
            System.out.println("Заказ отменён");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    @Override
    public String toString() {
        return String.format("Пицца: %s\nАдрес: %s\nСоус: %s\nРазмер: %s\nСтатус: %s", title, address, sauceNeedStringify(), size.getSizeName(), acceptStatusStringify());
    }
}
