package advanceproblems.validateacreditcardnumber;

import java.util.Scanner;

public class ValidateCreditCard {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a credit card number: ");

        // Read the input from the user
        String cardNumber = sc.nextLine();

        // Validate the credit card number
        if (isValidCardNumber(cardNumber)) {
            System.out.println("The credit card number " + cardNumber + " is valid.");
        } else {
            System.out.println("The credit card number " + cardNumber + " is not valid.");
        }

        // Close the Scanner
        sc.close();
    }

    // Method to validate a credit card number using the Luhn algorithm
    public static boolean isValidCardNumber(String cardNumber) {
        int nDigits = cardNumber.length();
        int sum = 0;
        boolean isSecond = false;

        for (int i = nDigits - 1; i >= 0; i--) {
            int d = cardNumber.charAt(i) - '0';

            if (isSecond == true)
                d = d * 2;

            // Add two digits to handle cases that make two digits after doubling
            sum += d / 10;
            sum += d % 10;

            isSecond = !isSecond;
        }
        return (sum % 10 == 0);
    }
}
