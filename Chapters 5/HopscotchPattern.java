public class HopscotchPattern {
    public static void main(String[] args) {
        int hops = 3;
        hopscotch(hops);
    }

    public static void hopscotch(int hops) {
        int currentNumber = 1;

        for (int i = 0; i < hops; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(currentNumber++ + " ");
                }
            } else {
                System.out.print(currentNumber++ + "\n");
            }
        }
    }
}
