import java.util.Scanner;

public class MainSumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        try {
            int userNumber = scanner.nextInt();
            int result = sumOfDigits(userNumber);
            System.out.println("Sum of the digits: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid four-digit integer.");

   }
    }

    public static int sumOfDigits(int number) {
        if (number >= 1000 && number <= 9999) {
            int thousands = number / 1000;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;
            return thousands + hundreds + tens + units;
        } else {
            throw new IllegalArgumentException("Input must be a four-digit integer.");
        }
    }
}