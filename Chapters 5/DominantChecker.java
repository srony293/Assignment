public class DominantChecker {
    public static void main(String[] args) {
        System.out.println(dominant(4, 9, 2));  // Should return true
        System.out.println(dominant(7, 5, 12));  // Should return true
        System.out.println(dominant(10, 3, 15));  // Should return true
        System.out.println(dominant(5, 5, 5));  // Should return false
    }

    public static boolean dominant(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c); // Find the maximum of the three numbers

        // Check if the maximum value is greater than the sum of the other two
        return max > (a + b + c - max);
    }
}
