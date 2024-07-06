package tomiks;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Sounding> animals;

    public void init() {
        animals = new ArrayList<Sounding>(){{
            add(new Cat());
            add(new Dog());
            add(new Donkey());
            add(new Giraffe());
        }};
    }

    public void soundAll() {
//        for (int animalNumber = 0; animalNumber < animals.size(); animalNumber++) {
//            animals.get(animalNumber).sound();
//        }
//
//        System.out.println("-------------------");

        animals.forEach(Sounding::sound);
        System.out.println("-------------------");
    }

    public void doProcess() {
        soundAll();

        animals.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("anonymous sound");
            }
        });

        soundAll();

        animals.add(() -> System.out.println("lambda sound, somebody hear that?"));

        soundAll();

        animals.add(new Hyena()::sound);

        soundAll();
    }
}
