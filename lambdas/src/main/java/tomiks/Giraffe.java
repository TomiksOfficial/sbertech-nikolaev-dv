package tomiks;

public class Giraffe implements Sounding {
    @Override
    public void sound() {
        final String PHRASE = "bleat";
        System.out.println(PHRASE);
    }
}
