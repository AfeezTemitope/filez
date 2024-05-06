import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 10;
        

        int[] numbers = new int[n];
        

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        

        System.out.println("The sum of the 10 numbers is: " + sum);
        

    }
}