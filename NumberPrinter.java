public class NumberPrinter {
    public static void printNumbers(int maxNumber) {
        if (maxNumber < 1) {
            System.out.println("No numbers to print.");
        } else {
            for (int i = 1; i <= maxNumber; i++) {
                System.out.print("[" + i + "] ");
            }
            System.out.println(); // Move to the next line after printing all numbers.
        }
    }

    public static void main(String[] args) {
        // Example calls to the printNumbers method
        printNumbers(5); // Prints [1] [2] [3] [4] [5]
        printNumbers(15); // Prints [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15]
        printNumbers(0); // No numbers to print.
        printNumbers(-3); // No numbers to print.
    }
}
