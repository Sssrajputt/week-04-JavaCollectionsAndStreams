package Submissionofcollections.setInterface.symmetricdifference;
import java.util.Set;
import java.util.TreeSet;

public class SymmetricDifference {
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

    public static Set<Integer> symmetric(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new TreeSet<>(set1);
        set3.addAll(set2);
        Set<Integer> temp = new TreeSet<>(set1);
        temp.retainAll(set2);
        set3.removeAll(temp);
        return set3;
    }

    public static void main(String[] args) {
        System.out.println("--------------------------");
        Set<Integer> setA = creatingASet();
        System.out.println("setA elements: " + setA);
        Set<Integer> setB = creatingASet1();
        System.out.println("setB elements: " + setB);

        Set<Integer> symmetricDifferenceSet = symmetric(setA, setB);
        System.out.println("Symmetric Difference: " + symmetricDifferenceSet);
        System.out.println("--------------------------");
    }
}
