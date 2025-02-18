package Submissionofcollections.listinterface.findfrequencyofelements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequency {
    public static Map<String, Integer> countFrequencies(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        return frequencyMap;
    }
}
