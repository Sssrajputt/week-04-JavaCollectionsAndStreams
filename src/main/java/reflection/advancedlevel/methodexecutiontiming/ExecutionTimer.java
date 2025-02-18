package reflection.advancedlevel.methodexecutiontiming;

import java.lang.reflect.Method;

public class ExecutionTimer {

    public static void measureMethodTime(Object obj, String methodName, Class<?>... parameterTypes) {
        try {
            // Get the method from the class
            Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);

            // Record the start time
            long startTime = System.nanoTime();

            // Invoke the method
            method.invoke(obj);

            // Record the end time
            long endTime = System.nanoTime();

            // Calculate the duration
            long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds

            // Print the execution time
            System.out.println("Execution time of " + methodName + ": " + duration + " ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


