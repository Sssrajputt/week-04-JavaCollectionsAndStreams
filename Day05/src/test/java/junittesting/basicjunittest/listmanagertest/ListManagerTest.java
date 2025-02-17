package junittesting.basicjunittest.listmanagertest;

// JUnit tests
import junit.basicjunittest.testinglistoperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    @Test
    public void testAddElement() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 1);
        assertEquals(1, list.size());
        assertTrue(list.contains(1));
    }

    @Test
    public void testRemoveElement() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        listManager.removeElement(list, 1);
        assertEquals(0, list.size());
    }

    @Test
    public void testGetSize() {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, listManager.getSize(list));
    }
}
