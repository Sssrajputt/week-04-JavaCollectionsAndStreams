package Submissionofcollections.designavotingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> hashMapVotes = new HashMap<>();
    private Map<String, Integer> treeMapVotes = new TreeMap<>();
    private Map<String, Integer> linkedHashMapVotes = new LinkedHashMap<>();

    // Method to add a vote
    public void addVote(String candidate) {
        // HashMap for storing votes
        hashMapVotes.put(candidate, hashMapVotes.getOrDefault(candidate, 0) + 1);

        // LinkedHashMap for maintaining the order of votes
        linkedHashMapVotes.put(candidate, linkedHashMapVotes.getOrDefault(candidate, 0) + 1);

        // TreeMap for displaying results in sorted order
        treeMapVotes.put(candidate, treeMapVotes.getOrDefault(candidate, 0) + 1);
    }

    // Method to display the results using TreeMap (sorted order)
    public void displayResultsSorted() {
        System.out.println("Results in Sorted Order:");
        for (Map.Entry<String, Integer> entry : treeMapVotes.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }

    // Method to display the results using LinkedHashMap (insertion order)
    public void displayResultsByInsertionOrder() {
        System.out.println("Results in Insertion Order:");
        for (Map.Entry<String, Integer> entry : linkedHashMapVotes.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }

    // Method to retrieve votes for a specific candidate
    public int getVotesForCandidate(String candidate) {
        return hashMapVotes.getOrDefault(candidate, 0);
    }
}
