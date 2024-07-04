package tomiks;

public class Dog implements Sounding {
    @Override
    public void sound() {
        final String PHRASE = "bark";
        System.out.println(PHRASE);
    }
}
