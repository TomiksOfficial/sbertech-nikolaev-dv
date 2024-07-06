package tomiks;

public class Donkey implements Sounding {
    @Override
    public void sound() {
        final String PHRASE = "hee-haw";
        System.out.println(PHRASE);
    }
}
