package Submissionofcollections.insurancepolicymanagementsystem2;
import java.util.*;
public class PolicyManagementSystem {
    Map<String, Policy> hashMapPolicies = new HashMap<>();
    private Map<String, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    private Map<Date, Policy> treeMapPolicies = new TreeMap<>();

    // Add policy to all maps
    public void addPolicy(Policy policy) {
        hashMapPolicies.put(policy.getPolicyNumber(), policy);
        linkedHashMapPolicies.put(policy.getPolicyNumber(), policy);
        treeMapPolicies.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Date expiryDate : treeMapPolicies.keySet()) {
            if (expiryDate.before(thresholdDate) && expiryDate.after(currentDate)) {
                expiringSoon.add(treeMapPolicies.get(expiryDate));
            }
        }
        return expiringSoon;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.getPolicyholderName().equals(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date currentDate = new Date();
        treeMapPolicies.entrySet().removeIf(entry -> entry.getKey().before(currentDate));

        for (Iterator<Map.Entry<String, Policy>> it = hashMapPolicies.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Policy> entry = it.next();
            if (entry.getValue().getExpiryDate().before(currentDate)) {
                it.remove();
            }
        }

        for (Iterator<Map.Entry<String, Policy>> it = linkedHashMapPolicies.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Policy> entry = it.next();
            if (entry.getValue().getExpiryDate().before(currentDate)) {
                it.remove();
            }
        }
    }
}
