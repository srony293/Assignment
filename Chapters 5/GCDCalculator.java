public class GCDCalculator {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int gcd(int a, int b) {
        // Ensure a and b are positive
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
