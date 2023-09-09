public class LargestAbsoluteValue {
    public static int largestAbsVal(int num1, int num2, int num3) {
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);
        int absNum3 = Math.abs(num3);

        int maxAbsValue = Math.max(absNum1, Math.max(absNum2, absNum3));

        return maxAbsValue;
    }

    public static void main(String[] args) {
        // Example calls to the largestAbsVal method
        int result1 = largestAbsVal(7, -2, -11); // Returns 11
        int result2 = largestAbsVal(-4, 5, 2); // Returns 5

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
