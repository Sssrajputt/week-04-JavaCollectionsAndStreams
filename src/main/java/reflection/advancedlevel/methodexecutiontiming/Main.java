package reflection.advancedlevel.methodexecutiontiming;

public class Main {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();

        // Measure execution time of longRunningMethod
        ExecutionTimer.measureMethodTime(sample, "longRunningMethod");

        // Measure execution time of shortRunningMethod
        ExecutionTimer.measureMethodTime(sample, "shortRunningMethod");
    }
}
