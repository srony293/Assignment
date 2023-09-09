public class SquarePrinter {
    public static void printSquare(int minimum, int maximum) {
        if (minimum > maximum) {
            System.out.println("Invalid input. Minimum cannot be greater than the maximum.");
        } else {
            int currentNumber = minimum;

            for (int i = minimum; i <= maximum; i++) {
                for (int j = minimum; j <= maximum; j++) {
                    System.out.print(currentNumber + " ");
                    currentNumber = (currentNumber == maximum) ? minimum : currentNumber + 1;
                }
                System.out.println(); // Move to the next line after printing each row.
                currentNumber = (i == maximum) ? minimum : i + 1;
            }
        }
    }

    public static void main(String[] args) {
        // Example call to the printSquare method
        printSquare(3, 7);
    }
}
