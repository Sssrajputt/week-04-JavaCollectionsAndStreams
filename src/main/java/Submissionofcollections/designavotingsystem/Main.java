package Submissionofcollections.designavotingsystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Add votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Charlie");
        votingSystem.addVote("Bob");

        // Display results in sorted order
        votingSystem.displayResultsSorted();

        // Display results in insertion order
        votingSystem.displayResultsByInsertionOrder();

        // Get votes for a specific candidate
        System.out.println("Votes for Alice: " + votingSystem.getVotesForCandidate("Alice"));
    }
}
