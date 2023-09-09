public class PowerOf2Printer {
    public static void printPowersOf2(int maxPower) {
        if (maxPower < 0) {
            System.out.println("Invalid input. Maximum power should be non-negative.");
        } else {
            int powerOf2 = 1;
            for (int i = 0; i <= maxPower; i++) {
                System.out.print(powerOf2 + " ");
                powerOf2 *= 2;
            }
            System.out.println(); // Move to the next line after printing all powers of 2.
        }
    }

    public static void main(String[] args) {
        // Example calls to the printPowersOf2 method
        printPowersOf2(5); // Prints 1 2 4 8 16 32
        printPowersOf2(12); // Prints 1 2 4 8 16 32 64 128 256 512 1024
        printPowersOf2(0); // Prints 1
        printPowersOf2(-3); // Invalid input. Maximum power should be non-negative.
    }
}
