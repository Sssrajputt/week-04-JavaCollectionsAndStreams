package junit.basicjunittest.testingstringutilitymethods;

public class StringUtils {

    // Reverses the given string.
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Checks if the given string is a palindrome.
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversedStr = reverse(str);
        return str.equals(reversedStr);
    }

    // Converts the given string to uppercase.
    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
