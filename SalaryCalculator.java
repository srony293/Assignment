public class SalaryCalculator {
    public static double pay(double salaryPerHour, int hoursWorked) {
        double regularPay;
        double overtimePay = 0.0;

        if (hoursWorked <= 8) {
            regularPay = salaryPerHour * hoursWorked;
        } else {
            regularPay = salaryPerHour * 8; // Regular pay for 8 hours

            // Calculate overtime pay for hours worked beyond 8 hours
            overtimePay = (hoursWorked - 8) * (salaryPerHour * 1.5);
        }

        return regularPay + overtimePay;
    }

    public static void main(String[] args) {
        // Example calls to the pay method
        double result1 = pay(5.50, 6); // Returns 33.0
        double result2 = pay(4.00, 11); // Returns 50.0

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
