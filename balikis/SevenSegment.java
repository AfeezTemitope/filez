import java.util.Scanner;

public class SevenSegment {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit you want to display: ");
        int number = scanner.nextInt();

switch (number){
	case 0->{ 
		System.out.println(" _ ");
                System.out.println("| |");
                System.out.println("|_|");
                }

	case 1->{ 
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		}
	case 2->{
		System.out.println(" __");
		System.out.println(" __|");
		System.out.println("|__");
		}
	case 3 -> {
                System.out.println(" _ ");
                System.out.println(" _|");
                System.out.println(" _|");
            	}
       	case 4 -> {
                System.out.println("   ");
                System.out.println("|_|");
                System.out.println("  |");
            }
	case 5 -> {
                System.out.println(" _ ");
                System.out.println("|_ ");
                System.out.println(" _|");
                }
	case 6 -> {
                System.out.println(" _ ");
                System.out.println("|_ ");
                System.out.println("|_|");
               }
	case 7 -> {
                System.out.println(" _ ");
                System.out.println("  |");
                System.out.println("  |");
               }
	case 8 -> {
                System.out.println(" _ ");
                System.out.println("|_|");
                System.out.println("|_|");
               }
	case 9 -> {
                System.out.println(" _ ");
                System.out.println("|_|");
                System.out.println(" _|");
               }
            default -> System.out.println("Invalid input! Please enter a binary digit from 0 to 1111.");
}
}
}
