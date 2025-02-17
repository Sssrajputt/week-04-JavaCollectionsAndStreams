package junittesting.advancejunittest.testingdateformater;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancedjunitpracticeproblems.testingdateformatter.DateFormatter;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    public void testValidDate() throws ParseException {
        DateFormatter formatter = new DateFormatter();
        assertEquals("31-12-2020", formatter.formatDate("2020-12-31"));
    }

    @Test
    public void testInvalidDate() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(ParseException.class, () -> {
            formatter.formatDate("invalid-date");
        });
    }
}
