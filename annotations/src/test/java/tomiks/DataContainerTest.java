package tomiks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DataContainerTest {

    @Test
    void baseSubClassesTest() {
        DataContainer dc = new DataContainer(1, "Tuesday");

        Assertions.assertThat(new FirstChildBase().doWorkOne(dc)).isEqualTo("Tuesday");
        Assertions.assertThat(new FirstChildBase().doWorkTwo(dc)).isEqualTo(1);
    }

}