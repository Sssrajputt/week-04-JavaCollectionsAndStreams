package junittesting.advancejunittest.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;

import junit.advancedjunitpracticeproblems.testinguserregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        UserRegistration registration = new UserRegistration();
        assertDoesNotThrow(() -> {
            registration.registerUser("user1", "user1@example.com", "Password123");
        });
    }

    @Test
    public void testInvalidUsername() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "user1@example.com", "Password123");
        });
    }

    @Test
    public void testInvalidEmail() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user1", "invalidemail", "Password123");
        });
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("user1", "user1@example.com", "short");
        });
    }
}
