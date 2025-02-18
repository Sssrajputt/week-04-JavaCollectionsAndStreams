package Submissionofcollections.setInterface.checkiftwosetsareequal;

import java.util.Set;
import java.util.TreeSet;

public class CheckIfTwoSetsAreEqual {

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
        set1.add(2);
        set1.add(1);
        return set1;
    }

    public static boolean checkIfTwoSetsAreEqual(Set<Integer> set1 ,Set<Integer> set2){
        if(set1.size() != set2.size()){return false;}
        if(set1.equals(set2)){return true;}
        return false;
    }

    public static void main(String args[]){
        System.out.println("----------------------------");
        Set<Integer> set1 = creatingASet();
        System.out.println("Set1 elements");
        Set<Integer> set2 = creatingASet1();
        System.out.println("Set2 elements");
        boolean br = checkIfTwoSetsAreEqual(set1,set2);
        System.out.println("Sets are: " + br);
        System.out.println("----------------------------");
    }
}
