package junit.basicjunittest.performancetestingusingtimeout;

public class Task {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Result";
    }
}
