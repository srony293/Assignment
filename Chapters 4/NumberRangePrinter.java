public class NumberRangePrinter {
    public static void printRange(int start, int end) {
        if (start == end) {
            System.out.println(start);
        } else if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example calls to the printRange method
        printRange(2, 7);    // Prints "2 3 4 5 6 7"
        printRange(19, 11);  // Prints "19 18 17 16 15 14 13 12 11"
        printRange(5, 5);    // Prints "5"
    }
}
