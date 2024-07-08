package tomiks;

@DayOfWeek(day = 3)
public class SecondChildBase extends Base {

    @TaskAnnotation(hours = 1, priority = 2, description = "Test")
    public <T extends DataContainer> String doWorkOne(T data) {
        System.out.println(data.getDayName());
        return data.getDayName();
    }

    @TaskAnnotation(hours = 2, priority = 1, description = "Test2")
    public <T extends DataContainer> int doWorkTwo(T data) {
        System.out.println(data.getUnixTimestamp());
        return data.getUnixTimestamp();
    }
}
