package Submissionofcollections.listinterface.findthenthelementfromtheend;

import java.util.LinkedList;
import java.util.List;

public class FindTheNthElementFromTheEnd {
    public static char findTheNthElementFromTheEnd(LinkedList<Character> linkedList, int num) {
        char ans = '1';  // Default value, ideally should handle edge cases or invalid inputs
        for (int i = 0; i < num; i++) {
            ans = linkedList.getLast();
            linkedList.removeLast();
        }
        return ans;
    }
}


