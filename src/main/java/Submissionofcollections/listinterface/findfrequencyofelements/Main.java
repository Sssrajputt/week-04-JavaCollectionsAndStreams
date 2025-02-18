package Submissionofcollections.listinterface.findfrequencyofelements;

import java.util.List;
import java.util.Map;

import static Submissionofcollections.listinterface.findfrequencyofelements.CountFrequency.countFrequencies;
import static Submissionofcollections.listinterface.findfrequencyofelements.ListOfStrings.listOfStrings;

public class Main {
    public static void main(String[] args) {
        List<String> list = listOfStrings();
        System.out.println("Frequency Map: " + list);
        Map<String, Integer> frequencyMap = countFrequencies(list);
        System.out.println("Frequency Map: " + frequencyMap);
    }

}
