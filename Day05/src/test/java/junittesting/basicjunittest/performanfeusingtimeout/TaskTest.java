package junittesting.basicjunittest.performanfeusingtimeout;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.performancetestingusingtimeout.Task;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TaskTest {

    @Test
    @Timeout(2)
    public void testLongRunningTask() throws InterruptedException {
        Task task = new Task();
        assertEquals("Result", task.longRunningTask());
    }
}
