package junittesting.basicjunittest.testingacalculator;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.testingacalculatorclass.CalculatorClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private CalculatorClass calculator;

    // This method runs before each test, ensuring we have a fresh instance of Calculator.
    @BeforeEach
    public void setUp() {
        calculator = new CalculatorClass();
    }

    // Tests the add method with various inputs.
    @Test
    public void testAdd() {
        assertEquals(5, CalculatorClass.add(2, 3));
        assertEquals(0, CalculatorClass.add(-1, 1));
    }

    // Tests the subtract method with various inputs.
    @Test
    public void testSubtract() {
        assertEquals(1, CalculatorClass.subtract(3, 2));
        assertEquals(-2, CalculatorClass.subtract(1, 3));
    }

    // Tests the multiply method with various inputs.
    @Test
    public void testMultiply() {
        assertEquals(6, CalculatorClass.multiply(2, 3));
        assertEquals(0, CalculatorClass.multiply(2, 0));
    }

    // Tests the divide method with various inputs, including a case that throws an exception.
    @Test
    public void testDivide() {
        assertEquals(2, CalculatorClass.divide(6, 3));
        assertEquals(-3, CalculatorClass.divide(9, -3));

        // This test expects an exception when dividing by zero.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculatorClass.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
