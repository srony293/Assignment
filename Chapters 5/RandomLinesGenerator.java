import java.util.Random;

public class RandomLinesGenerator {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        Random random = new Random();
        int numLines = random.nextInt(6) + 5; // Generate between 5 and 10 lines

        for (int i = 0; i < numLines; i++) {
            int lineLength = random.nextInt(81); // Random length up to 80 characters
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < lineLength; j++) {
                char randomChar = (char) (random.nextInt(26) + 'a'); // Random letter between 'a' and 'z'
                line.append(randomChar);
            }

            System.out.println(line);
        }
    }
}
