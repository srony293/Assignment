import java.util.Scanner;

public class NameProcessor {
    public static void processName(Scanner console) {
        System.out.print("Please enter your full name: ");
        String fullName = console.nextLine();

        // Split the full name into parts using whitespace as the delimiter
        String[] nameParts = fullName.split("\\s+");

        if (nameParts.length >= 2) {
            // Extract the last name (last element) and first name (first element)
            String lastName = nameParts[nameParts.length - 1];
            String firstName = nameParts[0];

            System.out.println("Your name in reverse order is: " + lastName + ", " + firstName);
        } else {
            System.out.println("Invalid input. Please enter both first and last names.");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        processName(console);
        console.close(); // Close the scanner when done
    }
}
