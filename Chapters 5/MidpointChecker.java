public class MidpointChecker {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(7, 4, 10));  // Should return true
        System.out.println(hasMidpoint(9, 15, 8));  // Should return false
        System.out.println(hasMidpoint(7, 7, 7));   // Should return true
    }

    public static boolean hasMidpoint(int a, int b, int c) {
        // Sort the three numbers in ascending order
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;  // Calculate the middle number

        // Check if the middle number is exactly halfway between the other two
        return (mid == (min + max) / 2);
    }
}
