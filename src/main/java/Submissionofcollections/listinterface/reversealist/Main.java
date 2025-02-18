package Submissionofcollections.listinterface.reversealist;

import java.util.List;

import static Submissionofcollections.listinterface.reversealist.ReverseALIstUsingLinkedLIst.creatingLinkedList;
import static Submissionofcollections.listinterface.reversealist.ReverseALIstUsingLinkedLIst.reverseUsingLinkedList;
import static Submissionofcollections.listinterface.reversealist.ReverseAListUsingArrayList.creatingArrayList;
import static Submissionofcollections.listinterface.reversealist.ReverseAListUsingArrayList.reverseUsingArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> arraylist = creatingArrayList();
        System.out.println("Original List: " + arraylist);
        List<Integer> reversedList = reverseUsingArrayList(arraylist);
        System.out.println("Reversed List: " + reversedList);

        List<Integer> linkedList = creatingLinkedList();
        System.out.println("Original List: " + linkedList);
        List<Integer> reversedListUsingLinkedList = reverseUsingLinkedList(linkedList);
        System.out.println("Reversed List: " + reversedListUsingLinkedList);
    }
}
