package junittesting.advancejunittest.testingpassowrdvalidator;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancedjunitpracticeproblems.testingpasswordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.validatePassword("Valid1Pass"));
    }

    @Test
    public void testInvalidPasswordShort() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.validatePassword("Short1"));
    }

    @Test
    public void testInvalidPasswordNoUpperCase() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.validatePassword("validpassword1"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.validatePassword("ValidPass"));
    }
}
