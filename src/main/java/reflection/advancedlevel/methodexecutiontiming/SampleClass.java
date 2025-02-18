package reflection.advancedlevel.methodexecutiontiming;

public class SampleClass {

    public void longRunningMethod() throws InterruptedException {
        // Simulate a long-running task
        Thread.sleep(2000);
    }

    public void shortRunningMethod() {
        // Simulate a short-running task
        for (int i = 0; i < 1000; i++) {
            Math.sqrt(i);
        }
    }
}

