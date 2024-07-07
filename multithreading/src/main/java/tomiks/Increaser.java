package tomiks;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Increaser extends Thread {
    private ResourceProcessor resourceProcessor;

    @Override
    public void run() {
//        КОД ДЛЯ ЗАДАЧ 1-5
//        for (int i = 0; i < 6; i++) {
//            resourceProcessor.increase();
//        }

        for (int i = 0; i < 10; i++) {
            resourceProcessor.increase();
        }
    }
}
