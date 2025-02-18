package annotations.exercise.createacustomannotationanduseit;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation @TaskInfo
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TaskInfo {
    String priority();
    String assignedTo();
}
