package setInterface.convertasettoasortedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static Submissionofcollections.setInterface.checkiftwosetsareequal.CheckIfTwoSetsAreEqual.creatingASet;
import static Submissionofcollections.setInterface.convertasettoasortedlist.ConvertASetToASortedList.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Main {
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }

    @Test
    public void testSorting() {
        System.out.println("----------------------------");
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(1);
        List<Integer> list1 = sort(list);
        List<Integer> list2 = sort(list);
        System.out.println("Sorted list1: " + list1);
        System.out.println("Sorted list2: " + list2);
        System.out.println("----------------------------");
        Assertions.assertEquals(list2, list1);
    }
}
