package tomiks;

public class Main {
    public static void main(String[] args) {

//        КОД ДЛЯ ЗАДАЧ 1-5
//        Resource resource = new Resource();
//        ResourceProcessor resourceProcessor = new ResourceProcessor(resource);
//
//        for (int i = 0; i < 3; i++) {
//            new Increaser(resourceProcessor).start();
//        }

        Resource resource = new Resource(0);
        ResourceProcessor resourceProcessor = new ResourceProcessor(resource);

        Increaser increaser = new Increaser(resourceProcessor);
        Decreaser decreaser = new Decreaser(resourceProcessor);

        increaser.start();
        new Thread(decreaser).start();
    }
}
