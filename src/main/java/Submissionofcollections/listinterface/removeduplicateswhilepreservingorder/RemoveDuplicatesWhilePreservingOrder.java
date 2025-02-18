package Submissionofcollections.listinterface.removeduplicateswhilepreservingorder;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


public class RemoveDuplicatesWhilePreservingOrder {
    //method to remove duplicates
    public static LinkedList<Integer> removeDuplicatesWhilePreservingOrder(List<Integer> linkedList) {
        LinkedHashSet<Integer> removeDuplicate = new LinkedHashSet<>(linkedList);
        return new LinkedList<>(removeDuplicate);
    }
}
