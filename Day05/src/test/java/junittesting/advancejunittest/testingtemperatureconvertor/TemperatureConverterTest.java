package junittesting.advancejunittest.testingtemperatureconvertor;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancedjunitpracticeproblems.testingtemperatureconverter.TemperatureConverter;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(212, converter.celsiusToFahrenheit(100));
    }

    @Test
    public void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(100, converter.fahrenheitToCelsius(212));
    }
}
