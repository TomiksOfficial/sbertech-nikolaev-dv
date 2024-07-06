package tomiks;

public class Cat implements Sounding {
    @Override
    public void sound() {
        final String PHRASE = "meow";
        System.out.println(PHRASE);
    }
}
