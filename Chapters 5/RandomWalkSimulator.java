import java.util.Random;

public class RandomWalkSimulator {
    public static void main(String[] args) {
        int maxPosition = randomWalk();
        System.out.println("max position = " + maxPosition);
    }

    public static int randomWalk() {
        int position = 0;
        int maxPosition = 0;
        Random random = new Random();

        while (Math.abs(position) < 3) {
            // Randomly decide to move left (-1) or right (+1)
            int step = random.nextInt(2) == 0 ? -1 : 1;

            position += step;

            System.out.println("position = " + position);

            // Update max position
            if (Math.abs(position) > Math.abs(maxPosition)) {
                maxPosition = position;
            }
        }

        return maxPosition;
    }
}
