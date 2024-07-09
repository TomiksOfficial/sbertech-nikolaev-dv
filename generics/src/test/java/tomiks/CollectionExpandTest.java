package tomiks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionExpandTest {

    @Test
    public void countEven() {
        List<Integer> list = new ArrayList<>(){{
            add(5);
            add(2);
            add(6);
            add(3);
            add(51);
            add(25);
            add(56);
            add(51);
            add(50);
        }};

        Assertions.assertThat(CollectionExpand.countEven(list)).isEqualTo(4);
    }

    @Test
    public void swapElementsByIndex() {
        List<Integer> list = new ArrayList<>(){{
            add(5);
            add(2);
            add(6);
            add(3);
            add(51);
            add(25);
            add(56);
            add(51);
            add(50);
        }};

        CollectionExpand.swapElementsByIndex(list, 2, 3);

        Assertions.assertThat(list.get(2)).isEqualTo(3);
    }

}