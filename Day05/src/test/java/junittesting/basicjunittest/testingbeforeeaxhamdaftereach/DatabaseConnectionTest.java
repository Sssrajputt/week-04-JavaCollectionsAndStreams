package junittesting.basicjunittest.testingbeforeeaxhamdaftereach;

// JUnit test
import junit.basicjunittest.Testingbeforeeachandaftereachanotations.DatabaseConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect();
    }

    @Test
    public void testConnection() {
        // Test to verify connection
    }

    @Test
    public void testDisconnection() {
        // Test to verify disconnection
    }
}