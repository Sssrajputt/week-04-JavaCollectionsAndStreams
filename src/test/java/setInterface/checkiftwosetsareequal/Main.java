package setInterface.checkiftwosetsareequal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static Submissionofcollections.setInterface.checkiftwosetsareequal.CheckIfTwoSetsAreEqual.*;

public class Main {
    @Test
    public static void main(String args[]){
        Set<Integer> set1 = creatingASet();
        Set<Integer> set2 = creatingASet1();
        boolean br = checkIfTwoSetsAreEqual(set1,set2);
        boolean br2 = true;
        Assertions.assertEquals(br,br2);
    }
}
