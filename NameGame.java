import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = console.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = console.nextLine();

        // Generate and print the Name Game song using the method
        nameGameSong(firstName, lastName);
        
        console.close(); // Close the scanner when done
    }

    public static void nameGameSong(String firstName, String lastName) {
        System.out.println("Now, let's play the Name Game!");
        System.out.println("Here's the song for " + firstName + ":");
        printNameSong(firstName);
        
        System.out.println("Here's the song for " + lastName + ":");
        printNameSong(lastName);
    }

    public static void printNameSong(String name) {
        char firstChar = Character.toLowerCase(name.charAt(0));
        String restOfName = name.substring(1);
        
        // Check if the first character is a vowel
        boolean isVowel = "aeiouAEIOU".contains(String.valueOf(firstChar));
        
        if (isVowel) {
            System.out.println(name + ", " + name + ", bo-b" + restOfName);
        } else {
            System.out.println(name + ", " + name + ", fo-f" + restOfName);
        }
        System.out.println("Banana-fana fo-f" + restOfName);
        System.out.println("Fee-fi-mo-m" + restOfName);
        System.out.println(name.toUpperCase() + "!");
    }
}
