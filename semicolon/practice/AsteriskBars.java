import java.util.Scanner;

public class AsteriskBars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display asterisks for each input number
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = scanner.nextInt();

            // Validate input (ensure it's within the specified range)
            while (number < 1 || number > 30) {
                System.out.print("Invalid input. Enter a number between 1 and 30: ");
                number = scanner.nextInt();
            }

            // Display the same number of adjacent asterisks
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}