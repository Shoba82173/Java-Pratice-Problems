package Recursion;
import java.util.Scanner;

public class PalindromeString {

    // Recursive function to check for palindrome
    public boolean isPalindrome(int i, String str) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }
        return isPalindrome(i + 1, str);
    }

    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        boolean result = ps.isPalindrome(0, str);
        System.out.println("Is palindrome: " + result);

        sc.close();
    }
}
