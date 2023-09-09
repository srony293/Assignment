import java.util.Scanner;

public class BirthdayInput {
    public static void inputBirthday(Scanner console) {
        System.out.print("Please enter your birth month (1-12): ");
        int month = console.nextInt();

        System.out.print("Please enter your birth day (1-31): ");
        int day = console.nextInt();

        System.out.print("Please enter your birth year (e.g., 1990): ");
        int year = console.nextInt();

        String birthdate = String.format("%02d/%02d/%04d", month, day, year);
        System.out.println("Your birthdate is: " + birthdate);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        inputBirthday(console);
        console.close(); // Close the scanner when done
    }
}
