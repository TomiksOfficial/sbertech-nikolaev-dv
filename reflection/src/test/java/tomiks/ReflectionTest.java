package tomiks;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Calendar;
import java.util.GregorianCalendar;

class ReflectionTest {

    @Test
    void scheduleWork() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1, 1, 1, 1, 0, 0);

        Reflection reflection = Mockito.mock(Reflection.class, Mockito.CALLS_REAL_METHODS);

        reflection.scheduleWork(calendar, 1, "Tuesday");

        Mockito.verify(reflection, Mockito.times(1)).scheduleWork(Mockito.any(), Mockito.anyInt(), Mockito.anyString());
    }
}