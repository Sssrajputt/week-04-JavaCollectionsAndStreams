package junittesting.basicjunittest.testingstringutilitymethods;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.testingstringutilitymethods.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    private StringUtils stringUtils;

    // This method runs before each test, ensuring we have a fresh instance of StringUtils.
    @BeforeEach
    public void setUp() {
        stringUtils = new StringUtils();
    }

    // Tests the reverse method with various inputs.
    @Test
    public void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("", stringUtils.reverse(""));
        assertEquals(null, stringUtils.reverse(null));
    }

    // Tests the isPalindrome method with various inputs.
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    // Tests the toUpperCase method with various inputs.
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals(null, stringUtils.toUpperCase(null));
    }
}
