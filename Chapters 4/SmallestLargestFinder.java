import java.util.Scanner;

public class SmallestLargestFinder {
    public static void smallestLargest(Scanner console) {
        System.out.print("How many numbers do you want to enter? ");
        int count = console.nextInt();

        if (count <= 0) {
            System.out.println("Invalid input. Please enter a valid number greater than 0.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            int number = console.nextInt();

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        smallestLargest(console);
        console.close(); // Close the scanner when done
    }
}
