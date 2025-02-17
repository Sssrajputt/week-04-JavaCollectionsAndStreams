package junittesting.basicjunittest.testingparameterizedtest;
// JUnit test
import junit.basicjunittest.testingparameterizedtests.NumberUtils;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    @junittesting.basicjunittest.testingparameterizedtest.ParameterizedTest
    @junittesting.basicjunittest.testingparameterizedtest.ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        NumberUtils numberUtils = new NumberUtils();
        if (number % 2 == 0) {
            assertTrue(numberUtils.isEven(number));
        } else {
            assertFalse(numberUtils.isEven(number));
        }
    }
}