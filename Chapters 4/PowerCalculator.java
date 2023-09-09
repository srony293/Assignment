public class PowerCalculator {
    public static int pow(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example calls to the pow method
        int result1 = pow(3, 4); // Returns 81 (3^4)
        int result2 = pow(2, 5); // Returns 32 (2^5)

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
