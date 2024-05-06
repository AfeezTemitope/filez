import java.util.Scanner;

public class NumberToTextConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Convert the number to a positive value (if negative)
        if (number < 0) {
            number = -number;
        }
String[] digitWords = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };
  String result = "";
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            result = digitWords[digit] + " " + result;
            number /= 10; // Remove the last digit
        }

        System.out.println("Number in text format: " + result);
    }
}