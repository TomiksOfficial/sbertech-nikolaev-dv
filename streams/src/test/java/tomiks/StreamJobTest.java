package tomiks;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StreamJobTest {

    @Test
    void intStreamGenerate() {
        StreamJob streamJob = Mockito.mock(StreamJob.class, Mockito.CALLS_REAL_METHODS);

        streamJob.intStreamGenerate();

        Mockito.verify(streamJob, Mockito.times(1)).intStreamGenerate();
    }

    @Test
    void calculateBooleanFromString() {
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("1111")).isEqualTo(true);
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("1111111111111111111")).isEqualTo(true);
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("11111111110111")).isEqualTo(false);
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("1000111")).isEqualTo(false);
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("0000000000000000")).isEqualTo(false);
        Assertions.assertThat(new StreamJob().calculateBooleanFromString("")).isEqualTo(false);
    }

    @Test
    void stringStreamWork() {
        StreamJob streamJob = Mockito.mock(StreamJob.class, Mockito.CALLS_REAL_METHODS);

        streamJob.stringStreamWork();

        Mockito.verify(streamJob, Mockito.times(1)).stringStreamWork();
    }

    @Test
    void mapStreamConverting() {
        StreamJob streamJob = Mockito.mock(StreamJob.class, Mockito.CALLS_REAL_METHODS);

        streamJob.mapStreamConverting();

        Mockito.verify(streamJob, Mockito.times(1)).mapStreamConverting();
    }
}