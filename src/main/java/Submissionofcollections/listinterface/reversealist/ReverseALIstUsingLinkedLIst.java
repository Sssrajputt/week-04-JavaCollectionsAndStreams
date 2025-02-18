package Submissionofcollections.listinterface.reversealist;

import java.util.LinkedList;
import java.util.List;

public class ReverseALIstUsingLinkedLIst{
    public static List<Integer> creatingLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        return linkedList;
    }

    public static List<Integer> reverseUsingLinkedList(List<Integer> linkedList) {
        List<Integer> linkedList1 = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            linkedList1.add(linkedList.remove(linkedList.size() - 1));
        }
        return linkedList1;
    }

}
