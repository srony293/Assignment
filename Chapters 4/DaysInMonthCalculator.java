public class DaysInMonthCalculator {
    public static int daysInMonth(int month) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return 28; // Assuming not a leap year
            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {
        // Example calls to the daysInMonth method
        int result1 = daysInMonth(9); // Returns 30 (September)
        int result2 = daysInMonth(2); // Returns 28 (February)
        int result3 = daysInMonth(13); // Returns -1 (Invalid month)

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
