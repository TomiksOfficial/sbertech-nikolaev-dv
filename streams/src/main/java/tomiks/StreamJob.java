package tomiks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamJob {
    public void intStreamGenerate() {
        IntStream stream = IntStream.generate(() -> new Random().nextInt(101)).limit(10);

        stream = stream.filter(v -> v >= 10 && v < 100).sorted();

        double average = stream.average().orElse(0);

        System.out.println("Average value: " + average);
    }

    public void stringStreamWork() {
        Stream<String> stream = Stream.of("Hello", "World");
        Random random = new Random();

        Stream<StreamContainer> newStream = stream.map(v -> {
            StreamContainer container = new StreamContainer(v, random.nextInt(101));

            System.out.println(container);

            return container;
        });

        Map<Long, String> map = newStream.collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void mapStreamConverting() {
        Map<String, List<StreamContainer>> mContainer = new HashMap<>(){{
            put("first", new ArrayList<StreamContainer>(){{
                add(new StreamContainer("firstContainer", new Random().nextInt(101)));
                add(new StreamContainer("secondContainer", new Random().nextInt(101)));
                add(new StreamContainer("thirdContainer", new Random().nextInt(101)));
            }});
            put("second", new ArrayList<StreamContainer>(){{
                add(new StreamContainer("fourthContainer", new Random().nextInt(101)));
                add(new StreamContainer("fifthContainer", new Random().nextInt(101)));
                add(new StreamContainer("sixContainer", new Random().nextInt(101)));
            }});
            put("third", new ArrayList<StreamContainer>(){{
                add(new StreamContainer("sevenContainer", new Random().nextInt(101)));
                add(new StreamContainer("eigthContainer", new Random().nextInt(101)));
                add(new StreamContainer("nineContainer", new Random().nextInt(101)));
            }});
        }};

        Stream<StreamContainer> stream = mContainer.values().stream().flatMap(Collection::stream);
        List<StreamContainer> containers = stream.toList();

        System.out.println("Length: " + containers.stream().count());
    }

    public boolean calculateBooleanFromString(String booleanString) {
        Stream<Boolean> stream = Stream.of(booleanString.split("")).map(v -> v.equals("1"));

        return stream.reduce((a, b) -> a && b).orElse(false);
    }
}
