import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        String choice;
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
         
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Y"));
        
       
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        
    }
}