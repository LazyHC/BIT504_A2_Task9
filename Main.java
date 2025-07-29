// ===========================================
// Course: BIT504
// Student number: 5125361
// Assessment 2 - Task 9
// ===========================================

// Import modules
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create input

        System.out.print("Please enter your name: "); // "print" instead of println ensure user data is entered on same line.

        String input = scanner.nextLine(); // Get user input

        System.out.println("------------");
        System.out.println("Your name is: " + input); // Output user name
        System.out.println("------------");

        scanner.close(); // Close scanner
    }
}
