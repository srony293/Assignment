public class FirstDigitExtractor {
    public static void main(String[] args) {
        System.out.println(firstDigit(3572)); // Should return 3
        System.out.println(firstDigit(-947)); // Should return 9
        System.out.println(firstDigit(0));    // Should return 0
    }

    public static int firstDigit(int number) {
        // Convert the integer to a string and remove any minus sign
        String numberStr = Integer.toString(Math.abs(number));

        // Extract the first character (first digit) as a char
        char firstChar = numberStr.charAt(0);

        // Convert the char back to an integer and return it
        return Character.getNumericValue(firstChar);
    }
}
