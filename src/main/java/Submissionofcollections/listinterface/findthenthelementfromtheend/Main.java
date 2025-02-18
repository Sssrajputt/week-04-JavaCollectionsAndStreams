package Submissionofcollections.listinterface.findthenthelementfromtheend;

import java.util.LinkedList;
import java.util.List;

import static Submissionofcollections.listinterface.rotateelementsinalist.CreatingList.list;

public class Main {

public static void main(String args[]) {
    LinkedList<Character> list = new LinkedList<>();
    list.add('a');
    list.add('b');
    list.add('c');
    list.add('d');

    System.out.println("----------------------------------");
    System.out.println("List: " + list);
    char chh = FindTheNthElementFromTheEnd.findTheNthElementFromTheEnd(list,2);
    System.out.println("Nth element from the end: " + chh);
    System.out.println("----------------------------------");
}
}
