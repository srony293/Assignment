public class FactorPrinter {
    public static void main(String[] args) {
        int number = 24;
        printFactors(number);
    }

    public static void printFactors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        System.out.print("1");

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }

        System.out.println();
    }
}
