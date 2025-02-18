package Submissionofcollections.insurancepolicymanagementsystem;

import java.util.Date;

public class PolicyPerformanceComparison {

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();
        Policy policy1 = new Policy("123", "John Doe", new Date(), "Health", 5000);
        Policy policy2 = new Policy("456", "Jane Doe", new Date(), "Auto", 3000);

        // Add policies and compare performance
        long startTime, endTime, duration;

        // HashSet Performance
        startTime = System.nanoTime();
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("HashSet Add Duration: " + duration + "ns");

        // LinkedHashSet Performance
        startTime = System.nanoTime();
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedHashSet Add Duration: " + duration + "ns");

        // TreeSet Performance
        startTime = System.nanoTime();
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("TreeSet Add Duration: " + duration + "ns");

        // Similar comparisons can be made for removing and searching
    }
}
