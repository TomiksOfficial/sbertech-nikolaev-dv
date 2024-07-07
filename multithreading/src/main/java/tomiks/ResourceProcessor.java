package tomiks;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResourceProcessor {
    private final Resource resource;

    public synchronized void increase() {
//        КОД 1-5 задача
//        resource.setCounter(resource.getCounter() + 1);
//        System.out.println("Resource counter(increase): " + resource.getCounter());

        if (resource.getCounter() >= 5) {
            try {
                wait();
            } catch (Exception ignored) {}
        }

        resource.setCounter(resource.getCounter() + 1);
        System.out.println("Resource counter(increase): " + resource.getCounter());

        notify();
    }

    public synchronized void decrease() {
//      1-5 задача
//      resource.setCounter(resource.getCounter() - 1);
//      System.out.println("Resource counter(decrease): " + resource.getCounter());

        if (resource.getCounter() < 1) {
            try {
                wait();
            } catch (Exception ignored) {}
        }

        resource.setCounter(resource.getCounter() - 1);
        System.out.println("Resource counter(decrease): " + resource.getCounter());

        notify();
    }
}
