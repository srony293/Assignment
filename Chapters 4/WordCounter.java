public class WordCounter {
    public static void main(String[] args) {
        String input1 = "hello ";
        String input2 = "how are you? ";
        String input3 = " this string has wide spaces ";
        String input4 = " ";

        System.out.println("Word count for '" + input1 + "': " + wordCount(input1));
        System.out.println("Word count for '" + input2 + "': " + wordCount(input2));
        System.out.println("Word count for '" + input3 + "': " + wordCount(input3));
        System.out.println("Word count for '" + input4 + "': " + wordCount(input4));
    }

    public static int wordCount(String input) {
        String[] words = input.split("\\s+"); // Split the input string by whitespace
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
