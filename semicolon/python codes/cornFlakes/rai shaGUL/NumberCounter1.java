import java.util.Scanner;

public class NumberCounter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int high = 0;
        int small = 0;
        String choice;
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
         
            if (num > high) {
                num = largest;
            } else if (num < small) {
                num = smallest;
            }
            
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("Y"));
        
       
        System.out.println("  " + large);
        System.out.println(" " + small);
        
    }
}