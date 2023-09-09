public class StutterString {
    public static void main(String[] args) {
        String input = "Hello!";
        String stutteredString = stutter(input);
        System.out.println(stutteredString);
    }

    public static String stutter(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar).append(currentChar); // Append the character twice
        }

        return result.toString();
    }
}
