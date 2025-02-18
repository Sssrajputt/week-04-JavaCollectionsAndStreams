package Submissionofcollections.setInterface.findsubsets;

import java.util.Set;
import java.util.TreeSet;

public class FindSubsets {
    public static Set<Integer> creatingASet(){
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(3);
        return set;
    }

    public static Set<Integer> creatingASet1(){
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        return set1;
    }

    public static boolean subset(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet<>(set2);
        if(set3.containsAll(set1)){return true;}
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--------------------------");
        Set<Integer> setA = creatingASet();
        System.out.println("setA elements: " + setA);
        Set<Integer> setB = creatingASet1();
        System.out.println("setB elements: " + setB);

        boolean br = subset(setA, setB);
        System.out.println("subset: " + br);
        System.out.println("--------------------------");
    }
}
