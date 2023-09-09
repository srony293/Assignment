import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    public static void printPalindrome(Scanner scanner) {
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // It's not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}
