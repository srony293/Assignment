public class PerfectNumbers {
    public static void main(String[] args) {
        int maximum = 500;
        System.out.println("Perfect numbers up to " + maximum + ":");
        perfectNumbers(maximum);
    }

    public static void perfectNumbers(int maximum) {
        for (int num = 2; num <= maximum; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1; // Start with 1 because every number is divisible by 1

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                // If the divisors are not the same, add the other divisor
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
