package Submissionofcollections.listinterface.reversealist;
import java.util.ArrayList;
import java.util.List;

public class ReverseAListUsingArrayList {

    public static List<Integer> creatingArrayList() {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        return arraylist;
    }

    public static List<Integer> reverseUsingArrayList(List<Integer> arraylist) {
        List<Integer> arraylist1 = new ArrayList<>();
        while (!arraylist.isEmpty()) {
            arraylist1.add(arraylist.remove(arraylist.size() - 1));
        }
        return arraylist1;
    }
}
