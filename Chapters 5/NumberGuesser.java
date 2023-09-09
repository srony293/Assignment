import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random random = new Random();
        int totalGuesses = 0;

        while (true) {
            int guess = random.nextInt(50) + 1; // Generate a random guess between 1 and 50
            System.out.println("guess = " + guess);
            totalGuesses++;

            if (guess >= 48) {
                break;
            }
        }

        System.out.println("total guesses = " + totalGuesses);
    }
}
