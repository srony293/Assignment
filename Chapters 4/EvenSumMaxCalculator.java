import java.util.Scanner;

public class EvenSumMaxCalculator {
    public static void evenSumMax(Scanner console) {
        System.out.print("How many integers? ");
        int count = console.nextInt();

        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Next integer? ");
            int number = console.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
            }
        }

        System.out.println("Even sum = " + evenSum + ", Even max = " + evenMax);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        evenSumMax(console);
        console.close(); // Close the scanner when done
    }
}
