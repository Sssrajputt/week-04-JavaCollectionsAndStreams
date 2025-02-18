package Submissionofcollections.insurancepolicymanagementsystem;

import java.util.*;

public class PolicyManagementSystem {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public List<Policy> getAllUniquePolicies() {
        return new ArrayList<>(hashSetPolicies);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Policy policy : treeSetPolicies) {
            if (policy.getExpiryDate().before(thresholdDate) && policy.getExpiryDate().after(currentDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> policiesByCoverageType = new ArrayList<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equals(coverageType)) {
                policiesByCoverageType.add(policy);
            }
        }
        return policiesByCoverageType;
    }

    public List<Policy> getDuplicatePolicies() {
        Map<String, Policy> policyMap = new HashMap<>();
        List<Policy> duplicatePolicies = new ArrayList<>();

        for (Policy policy : hashSetPolicies) {
            if (policyMap.containsKey(policy.getPolicyNumber())) {
                duplicatePolicies.add(policy);
            } else {
                policyMap.put(policy.getPolicyNumber(), policy);
            }
        }
        return duplicatePolicies;
    }
}
