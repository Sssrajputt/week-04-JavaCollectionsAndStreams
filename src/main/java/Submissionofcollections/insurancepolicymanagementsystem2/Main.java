package Submissionofcollections.insurancepolicymanagementsystem2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        // Create some policy objects
        Calendar calendar = Calendar.getInstance();

        calendar.set(2025, Calendar.MARCH, 1);
        Policy policy1 = new Policy("123", "John Doe", calendar.getTime(), "Health", 5000);

        calendar.set(2025, Calendar.APRIL, 1);
        Policy policy2 = new Policy("456", "Jane Doe", calendar.getTime(), "Auto", 3000);

        calendar.set(2025, Calendar.JANUARY, 10);
        Policy policy3 = new Policy("789", "John Doe", calendar.getTime(), "Home", 4000);

        // Add policies to the system
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);

        // Retrieve and print a policy by number
        System.out.println(system.getPolicyByNumber("123"));

        // List all policies expiring within the next 30 days
        System.out.println(system.getPoliciesExpiringSoon());

        // List all policies for a specific policyholder
        System.out.println(system.getPoliciesByPolicyholder("John Doe"));

        // Remove expired policies
        system.removeExpiredPolicies();

        // List all policies to verify removal of expired ones
        System.out.println(system.hashMapPolicies.values());
    }
}
