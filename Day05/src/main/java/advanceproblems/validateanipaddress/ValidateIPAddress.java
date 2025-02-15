package advanceproblems.validateanipaddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IP address: ");

        // Read the input from the user
        String ipAddress = sc.nextLine();

        // Define the regex pattern for a valid IPv4 address
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Use Pattern to compile the regex and match the input IP address
        Pattern pattern = Pattern.compile(ipPattern);
        boolean isValid = pattern.matcher(ipAddress).matches();

        // Print the validation result
        if (isValid) {
            System.out.println("The IP address " + ipAddress + " is valid.");
        } else {
            System.out.println("The IP address " + ipAddress + " is not valid.");
        }

        // Close the Scanner
        sc.close();
    }
}
