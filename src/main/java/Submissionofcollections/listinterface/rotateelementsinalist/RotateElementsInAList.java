package Submissionofcollections.listinterface.rotateelementsinalist;
import java.util.LinkedList;
import java.util.List;

public class RotateElementsInAList {

    // Method to rotate elements in the list by a given number of positions
    public static List<Integer> rotateElementsInAList(List<Integer> linkedList, int num) {
        List<Integer> rotateList = new LinkedList<>();
        int size = linkedList.size();

        // Ensure num is within the valid range using modulo operation
        num = num % size;

        // Add elements from the rotated position to the end of the list
        for (int i = num; i < size; i++) {
            rotateList.add(linkedList.get(i));
        }
        // Add elements from the start of the list to the rotated position
        for (int i = 0; i < num; i++) {
            rotateList.add(linkedList.get(i));
        }

        return rotateList;
    }

}
