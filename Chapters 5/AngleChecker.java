public class AngleChecker {
    public static void main(String[] args) {
        System.out.println(anglePairs(120, 60, 30));  // Should return true
        System.out.println(anglePairs(45, 45, 90));   // Should return true
        System.out.println(anglePairs(60, 45, 75));   // Should return false
        System.out.println(anglePairs(0, 90, 90));    // Should return false
    }

    public static boolean anglePairs(int angle1, int angle2, int angle3) {
        // Check if any two angles add up to 90 degrees
        boolean isComplementary = (angle1 + angle2 == 90) || (angle1 + angle3 == 90) || (angle2 + angle3 == 90);

        // Check if any two angles add up to 180 degrees
        boolean isSupplementary = (angle1 + angle2 == 180) || (angle1 + angle3 == 180) || (angle2 + angle3 == 180);

        // Return true if both complementary and supplementary angles exist
        return isComplementary && isSupplementary;
    }
}
