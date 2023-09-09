import java.util.Scanner;

public class LongestNameFinder {
    public static void longestName(Scanner console, int numNames) {
        if (numNames <= 0) {
            System.out.println("Invalid input. Please enter a valid number of names.");
            return;
        }

        String longestName = "";
        int maxLength = 0;

        for (int i = 1; i <= numNames; i++) {
            System.out.print("name #" + i + "? ");
            String name = console.next();

            if (name.length() > maxLength) {
                maxLength = name.length();
                longestName = name;
            }
        }

        System.out.println(longestName + "'s name is longest");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = console.nextInt();

        longestName(console, numNames);
        console.close(); // Close the scanner when done
    }
}
