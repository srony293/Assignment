public class ScientificNotation {
    public static double scientific(double base, int exponent) {
        // Compute the result as base * 10^exponent
        double result = base * Math.pow(10, exponent);
        return result;
    }

    public static void main(String[] args) {
        // Example calls to the scientific method
        double result1 = scientific(6.23, 5); // Returns 623000.0
        double result2 = scientific(1.9, -2); // Returns 0.019

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
