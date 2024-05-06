import java.util.Scanner;

public class PhonebookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. View Contacts");
            System.out.println("2. View Call Logs");
            System.out.println("3. Call Settings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

 switch (choice) {
                case 1:{
                    System.out.println("Viewing contacts...");
                    break;}
                case 2:{
                    System.out.println("Viewing call logs...");
                    break;}
                case 3:{
                    System.out.println("Adjusting call settings...");
                    break;}
case 4:{
                    System.out.println("Exiting Phonebook. Goodbye!");
                    System.exit(0);}
                default:{
                    System.out.println("Invalid choice. Please select a valid option.");
       }
}
     }
        }
    }

