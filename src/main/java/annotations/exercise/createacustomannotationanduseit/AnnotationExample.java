package annotations.exercise.createacustomannotationanduseit;

import java.lang.reflect.Method;

public class AnnotationExample {

    public static void main(String[] args) {
        try {
            // Obtain the Class object for the TaskManager class
            Class<?> taskManagerClass = Class.forName("src/main/java/reflection/practice problems/basic level/accessprivatefield/Person.java");

            // Obtain the Method object for the completeTask method
            Method completeTaskMethod = taskManagerClass.getMethod("completeTask");

            // Check if the @TaskInfo annotation is present on the method
            if (completeTaskMethod.isAnnotationPresent(TaskInfo.class)) {
                // Retrieve the annotation
                TaskInfo taskInfo = completeTaskMethod.getAnnotation(TaskInfo.class);

                // Display the annotation details
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
