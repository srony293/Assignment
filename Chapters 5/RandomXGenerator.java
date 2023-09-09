import java.util.Random;

public class RandomXGenerator {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        Random random = new Random();
        
        while (true) {
            int lineLength = random.nextInt(16) + 5; // Random length between 5 and 20
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < lineLength; i++) {
                line.append("x");
            }

            System.out.println(line);

            if (line.length() >= 16) {
                break;
            }
        }
    }
}
