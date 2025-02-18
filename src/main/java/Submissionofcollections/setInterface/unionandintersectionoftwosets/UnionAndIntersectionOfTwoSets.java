package Submissionofcollections.setInterface.unionandintersectionoftwosets;

import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersectionOfTwoSets {
    public static Set<Integer> creatingASet(){
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        return set;
    }

    public static Set<Integer> creatingASet1(){
        Set<Integer> set1 = new TreeSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        return set1;
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet<>(set1);
        set3.addAll(set2);
        return set3;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet<>(set1);
        set3.retainAll(set2);
        return set3;
    }

    public static void main(String[] args) {
        System.out.println("--------------------------");
        Set<Integer> setA = creatingASet();
        System.out.println("setA elements: " + setA);
        Set<Integer> setB = creatingASet1();
        System.out.println("setB elements: " + setB);

        Set<Integer> unionSet = union(setA, setB);
        Set<Integer> intersectionSet = intersection(setA, setB);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
        System.out.println("--------------------------");
    }
}
