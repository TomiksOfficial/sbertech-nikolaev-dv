package tomiks;

import lombok.NonNull;

public class FirstChildBase extends Base {

    @TaskAnnotation(hours = 3, priority = 1, description = "Test3")
    public <T extends DataContainer> String doWorkOne(@NonNull T data) {
        System.out.println(data.getDayName());
        return data.getDayName();
    }

    @TaskAnnotation(hours = 4, priority = 1, description = "Test4")
    public <T extends DataContainer> int doWorkTwo(@NonNull T data) {
        System.out.println(data.getUnixTimestamp());
        return data.getUnixTimestamp();
    }

}
