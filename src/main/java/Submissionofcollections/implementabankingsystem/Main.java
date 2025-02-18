package Submissionofcollections.implementabankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Add customer accounts
        bankingSystem.addAccount("ACC001", 5000);
        bankingSystem.addAccount("ACC002", 3000);
        bankingSystem.addAccount("ACC003", 7000);

        // Display accounts sorted by balance
        bankingSystem.displaySortedAccounts();

        // Process withdrawal requests
        bankingSystem.processWithdrawalRequest("ACC001", 2000);
        bankingSystem.processWithdrawalRequest("ACC002", 4000);

        // Execute withdrawals
        bankingSystem.executeWithdrawals();

        // Display accounts sorted by balance after withdrawals
        bankingSystem.displaySortedAccounts();
    }
}
