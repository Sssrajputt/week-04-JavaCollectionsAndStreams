package Submissionofcollections.implementabankingsystem;

import java.util.*;

public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Method to add a customer account
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    // Method to process a withdrawal request
    public void processWithdrawalRequest(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Method to execute withdrawal requests
    public void executeWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            String accountNumber = request.getAccountNumber();
            double amount = request.getAmount();

            if (accounts.containsKey(accountNumber)) {
                double currentBalance = accounts.get(accountNumber);

                if (currentBalance >= amount) {
                    double newBalance = currentBalance - amount;
                    accounts.put(accountNumber, newBalance);
                    sortedAccounts.remove(currentBalance);
                    sortedAccounts.put(newBalance, accountNumber);
                    System.out.println("Withdrawal of " + amount + " from account " + accountNumber + " successful.");
                } else {
                    System.out.println("Insufficient funds for account " + accountNumber + ".");
                }
            } else {
                System.out.println("Account " + accountNumber + " not found.");
            }
        }
    }

    // Method to display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + ", Balance: " + entry.getKey());
        }
    }

    // Inner class for withdrawal requests
    private class WithdrawalRequest {
        private String accountNumber;
        private double amount;

        public WithdrawalRequest(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getAmount() {
            return amount;
        }
    }
}
