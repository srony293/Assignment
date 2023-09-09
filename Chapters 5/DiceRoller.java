import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diceSum(scanner);
    }

    public static void diceSum(Scanner scanner) {
        System.out.print("Desired dice sum: ");
        int desiredSum = scanner.nextInt();
        
        Random random = new Random();
        
        while (true) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            
            System.out.println(die1 + " and " + die2 + " = " + sum);
            
            if (sum == desiredSum) {
                break;
            }
        }
    }
}
