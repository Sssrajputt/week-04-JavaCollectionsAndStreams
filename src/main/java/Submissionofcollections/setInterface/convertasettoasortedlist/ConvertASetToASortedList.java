package Submissionofcollections.setInterface.convertasettoasortedlist;

import java.util.*;

import static Submissionofcollections.setInterface.checkiftwosetsareequal.CheckIfTwoSetsAreEqual.creatingASet;
import java.util.*;

public class ConvertASetToASortedList {
    public static List<Integer> creatingAList() {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(1);
        return list;
    }

    public static Set<Integer> sort(List<Integer> list) {
        return new TreeSet<>(list);
    }

    public static void main(String[] args) {
        System.out.println("----------------------------");
        List<Integer> list1 = creatingAList();
        System.out.println("List elements: " + list1);
        Set<Integer> set = new TreeSet<>(list1);
        System.out.println("Set elements: " + set);
        System.out.println("----------------------------");
    }
}
