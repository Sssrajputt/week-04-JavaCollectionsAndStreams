package Submissionofcollections.listinterface.removeduplicateswhilepreservingorder;

import java.util.LinkedList;
import java.util.List;
import static Submissionofcollections.listinterface.removeduplicateswhilepreservingorder.CreatingList.list;
import static Submissionofcollections.listinterface.removeduplicateswhilepreservingorder.RemoveDuplicatesWhilePreservingOrder.removeDuplicatesWhilePreservingOrder;

//main class
public class Main {
    public static void main(String args[]){
        System.out.println("----------------------------------");
        List<Integer> list = list();
        System.out.println("List: " + list);
        LinkedList<Integer> removeDuplicates = removeDuplicatesWhilePreservingOrder(list);
        System.out.println("List after removing duplicates: " + removeDuplicates);
        System.out.println("----------------------------------");
    }
}
