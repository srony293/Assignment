public class GridPrinter {
    public static void printGrid(int rows, int columns) {
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid input. Both rows and columns should be greater than zero.");
        } else {
            int maxValue = rows * columns;
            int currentValue = 1;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(currentValue + "\t");
                    currentValue++;

                    if (currentValue > maxValue) {
                        break; // Stop printing if we've reached the maximum value
                    }
                }
                System.out.println(); // Move to the next row
                if (currentValue > maxValue) {
                    break; // Stop printing if we've reached the maximum value
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example call to the printGrid method
        printGrid(4, 6);
    }
}
