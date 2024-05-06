import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number to reverse:");
        int number = scanner.nextInt();

        int result = ArraySnack.reverseNumber(number);
        System.out.println("The reverse of " + number + " is " + result);
    }
}
