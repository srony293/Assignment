public class AverageCalculator {
    public static double average(int num1, int num2) {
        // Calculate the average of num1 and num2
        return (double) (num1 + num2) / 2;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        double result = average(num1, num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + result);
    }
}
