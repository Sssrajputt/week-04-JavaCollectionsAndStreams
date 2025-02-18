package Submissionofcollections.listinterface.rotateelementsinalist;

import java.util.LinkedList;
import java.util.List;

public class CreatingList {

    // Method to create and return a list of integers
    public static List<Integer> list() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        return linkedList;
    }
}
