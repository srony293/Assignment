public class LastDigitExtractor {
    public static int lastDigit(int number) {
        // Take the absolute value to handle negative numbers
        int absNumber = Math.abs(number);

        // Convert the absolute value to a string
        String numberStr = Integer.toString(absNumber);

        // Get the last character (which represents the last digit)
        char lastChar = numberStr.charAt(numberStr.length() - 1);

        // Convert the last character back to an integer and return it
        int lastDigit = Character.getNumericValue(lastChar);

        return lastDigit;
    }

    public static void main(String[] args) {
        // Example calls to the lastDigit method
        int result1 = lastDigit(3572); // Returns 2
        int result2 = lastDigit(-947); // Returns 7

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
