package tomiks;

@DayOfWeek(day = 3)
public class SecondChildBase extends Base {

    @TaskAnnotation(hours = 1, priority = 2, description = "Test")
    public <T extends DataContainer> String doWorkOne(T data) {
        System.out.println(data.getDayName() + " SeconddoWorkOne");
        return data.getDayName();
    }

    @TaskAnnotation(hours = 1, priority = 1, description = "Test2")
    @TaskAnnotation(hours = 1, priority = 3, description = "TestRepeate3")
    public <T extends DataContainer> int doWorkTwo(T data) {
        System.out.println(data.getUnixTimestamp() + " SeconddoWorkTwo");
        return data.getUnixTimestamp();
    }
}
