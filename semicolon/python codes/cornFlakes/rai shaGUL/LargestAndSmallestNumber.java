import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

while (true) {
            System.out.print("Enter an integer: ");
            try {
                int number = input.nextInt();
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            } catch (Exception e) {
                break;
}
        }

        System.out.println("The largest integer entered is: " + largest);
        System.out.println("The smallest integer entered is: " + smallest);
    }
}