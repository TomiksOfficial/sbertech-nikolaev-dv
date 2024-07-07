package tomiks;

import java.util.Collection;
import java.util.List;

public class CollectionExpand {
    public static <T extends Number> long countEven(Collection<T> collection) {
        return collection.stream()
                .filter(v -> v.intValue() % 2 == 0)
                .count();
    }

    public static void swapElementsByIndex(List<?> collection, int indexFirst, int indexSecond) {
        List collectionCopy = collection;
        collectionCopy.set(indexFirst, collectionCopy.set(indexSecond, collectionCopy.get(indexFirst)));
    }
}
