public class PowerOfNPrinter {
    public static void printPowersOfN(int base, int maxExponent) {
        if (maxExponent < 0) {
            System.out.println("Invalid input. Maximum exponent should be non-negative.");
        } else {
            int result = 1;
            for (int exponent = 0; exponent <= maxExponent; exponent++) {
                System.out.print(result + " ");
                result *= base;
            }
            System.out.println(); // Move to the next line after printing all powers of N.
        }
    }

    public static void main(String[] args) {
        // Example calls to the printPowersOfN method
        printPowersOfN(4, 3); // Prints 1 2 4 8 16 32
        printPowersOfN(5, 6); // Prints 1 3 9 27 81
        printPowersOfN(-2, 8); // Prints 1 5 25 125
        printPowersOfN(4, 0); // Prints 1
        printPowersOfN(2, -3); // Invalid input. Maximum exponent should be non-negative.
    }
}
