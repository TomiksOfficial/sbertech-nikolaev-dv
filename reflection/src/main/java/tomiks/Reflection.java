package tomiks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Reflection {
    public void scheduleWork(Calendar date, int unixTimestamp, String dayName) {
        DataContainer dc = new DataContainer(unixTimestamp, dayName);
        SecondChildBase secondChildBase = new SecondChildBase();

        Map<Integer, ArrayList<Method>> methodMap = new HashMap<>();

        for (Method method : secondChildBase.getClass().getDeclaredMethods()) {
            try {
                TaskAnnotation[] annotation = method.getAnnotationsByType(TaskAnnotation.class);

                for (TaskAnnotation ta : annotation) {
                    if (ta.hours() == date.get(Calendar.HOUR_OF_DAY)) {
                        if (!methodMap.containsKey(ta.priority()))
                        {
                            methodMap.put(ta.priority(), new ArrayList<>(){{
                                add(method);
                            }});
                            continue;
                        }

                        methodMap.get(ta.priority()).add(method);
                    }
                }

            } catch (Exception ignored) {}
        }

        for (Integer key : methodMap.keySet().stream().sorted().toList()) {
            for (Method method : methodMap.get(key)) {
                try {
                    method.invoke(secondChildBase, dc);

                    Field unixTime = dc.getClass().getDeclaredField("unixTimestamp");
                    Field day = dc.getClass().getDeclaredField("dayName");

                    unixTime.setAccessible(true);
                    day.setAccessible(true);

                    System.out.println("unixTime: " + unixTime.get(dc) + " day: " + day.get(dc));
                } catch (Exception ignored) {}
            }
        }
    }
}
