package oop.task.four;

public class Author {
    private String name;
    private String surname;
    private boolean isMale;
    private String email;

    public Author(String name, String surname, boolean isMale, String email) {
        this.name = name;
        this.surname = surname;
        this.isMale = isMale;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String isMale() {
        if (isMale)
        {
            return "Male";
        } else {
            return "Female";
        }
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nSurname: %s\nSex: %s\nEmail: %s", name, surname, isMale(), email);
    }
}
