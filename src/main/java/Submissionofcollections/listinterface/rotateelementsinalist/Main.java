package Submissionofcollections.listinterface.rotateelementsinalist;

import java.util.List;

import static Submissionofcollections.listinterface.rotateelementsinalist.CreatingList.list;
import static Submissionofcollections.listinterface.rotateelementsinalist.RotateElementsInAList.rotateElementsInAList;

public class Main {
    // Main method to test the rotation functionality
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        // Create the initial list
        List<Integer> list = list();
        System.out.println("List: " + list);
        // Rotate the list by 2 positions
        List<Integer> rotatedList = rotateElementsInAList(list, 2);
        System.out.println("List After Rotation: " + rotatedList);
        System.out.println("------------------------------------------");
    }
}