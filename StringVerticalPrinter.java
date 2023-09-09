public class StringVerticalPrinter {
    public static void vertical(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
        // Example call to the vertical method
        vertical("hey now");
    }
}
