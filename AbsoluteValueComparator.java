public class AbsoluteValueComparator {
    public static int largerAbsVal(int num1, int num2) {
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        if (absNum1 > absNum2) {
            return absNum1;
        } else {
            return absNum2;
        }
    }

    public static void main(String[] args) {
        // Example calls to the largerAbsVal method
        int result1 = largerAbsVal(11, 2); // Returns 11
        int result2 = largerAbsVal(4, -5); // Returns 5

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
