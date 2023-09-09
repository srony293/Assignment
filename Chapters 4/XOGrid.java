public class XOGrid {
    public static void xo(int size) {
        if (size <= 0) {
            System.out.println("Invalid size.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        // Example calls to the xo method
        xo(4);
        System.out.println(); // Separate the outputs
        xo(6);
    }
}
