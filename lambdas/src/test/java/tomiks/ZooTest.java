package tomiks;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ZooTest {

    @Test
    void soundAll() {
        Zoo zoo = Mockito.mock(Zoo.class, Mockito.CALLS_REAL_METHODS);

        zoo.init();
        zoo.doProcess();

        Mockito.verify(zoo, Mockito.times(4)).soundAll();
    }
}