package junittesting.basicjunittest.testingfilehandling;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.testingfilehandlingmethods.FileProcessor;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessorTest {

    @Test
    public void testWriteAndReadFile() throws IOException {
        FileProcessor fp = new FileProcessor();
        String filename = "testfile.txt";
        String content = "Hello, world!";

        fp.writeToFile(filename, content);
        assertEquals(content, fp.readFromFile(filename));
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        FileProcessor fp = new FileProcessor();
        String filename = "testfile.txt";
        String content = "Hello, world!";

        fp.writeToFile(filename, content);
        Path path = Paths.get(filename);
        assertTrue(Files.exists(path));
    }

    @Test
    public void testIOExceptionWhenFileDoesNotExist() {
        FileProcessor fp = new FileProcessor();
        assertThrows(IOException.class, () -> {
            fp.readFromFile("nonexistentfile.txt");
        });
    }
}
