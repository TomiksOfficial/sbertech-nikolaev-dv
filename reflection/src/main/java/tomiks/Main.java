package tomiks;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(1, 1, 1, 1, 0, 0);
        new Reflection().scheduleWork(calendar, 1, "Tuesday");
    }
}