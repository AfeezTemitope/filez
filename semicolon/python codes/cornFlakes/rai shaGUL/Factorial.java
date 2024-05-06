import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
 System.out.println("Factorial of " + number + " is: " + factorial);
    }
}