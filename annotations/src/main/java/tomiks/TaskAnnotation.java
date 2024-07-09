package tomiks;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Repeatable(TaskAnnotations.class)
public @interface TaskAnnotation {
    int hours();
    int priority();
    String description();
}
