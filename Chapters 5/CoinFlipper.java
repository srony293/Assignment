import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads() {
        Random random = new Random();
        int consecutiveHeads = 0;

        System.out.println("Coin flips:");

        while (consecutiveHeads < 3) {
            boolean isHeads = random.nextBoolean();

            if (isHeads) {
                System.out.print("H ");
                consecutiveHeads++;
            } else {
                System.out.print("T ");
                consecutiveHeads = 0;
            }
        }

        System.out.println("\nThree heads in a row!");
    }
}
