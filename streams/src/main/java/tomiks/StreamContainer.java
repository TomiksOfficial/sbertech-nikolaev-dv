package tomiks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class StreamContainer {

    @Getter
    private String name;

    @Getter
    private long count;

    @Override
    public String toString() {
        return "StreamContainer [name=" + name + ", count=" + count + "]";
    }
}
