import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        printAverage();
    }

    public static void printAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Type a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                if (count == 0) {
                    System.out.println("No non-negative numbers entered.");
                } else {
                    double average = (double) sum / count;
                    System.out.println("Average was " + average);
                }
                break;
            }

            sum += number;
            count++;
        }
    }
}
