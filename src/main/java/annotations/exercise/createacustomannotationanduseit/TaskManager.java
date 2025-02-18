package annotations.exercise.createacustomannotationanduseit;

import java.lang.reflect.Method;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}


