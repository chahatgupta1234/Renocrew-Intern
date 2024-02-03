import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for input
        System.out.print("Enter your message: ");

        // Taking input from the user
        String userMessage = scanner.nextLine();

        // Displaying the message using sout
        System.out.println("You entered: " + userMessage);

        // Closing the Scanner to avoid resource leaks
        scanner.close();
    }
}
