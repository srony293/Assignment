public class StringRepeater {
    public static String repl(String inputString, int repetitions) {
        if (repetitions <= 0) {
            return ""; // Return an empty string if repetitions is zero or less
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            result.append(inputString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example calls to the repl method
        String result1 = repl("hello ", 3); // Returns "hellohellohello"
        String result2 = repl("abc", 0);    // Returns ""
        String result3 = repl("xyz", -2);   // Returns ""

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
