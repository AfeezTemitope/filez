import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
char choice ;
        do {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);


System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        
    }
}

