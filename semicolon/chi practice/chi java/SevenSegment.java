import java.util.*;

public class SevenSegment {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            for (int i = 0; i < 8; i++) {
                System.out.print("Enter a number between (1 & 0) :");
                userInput = scanner.nextInt();
                if(userInput == 0 || userInput == 1) {
                    break;
                }
            }
        } while(userInput != 1 && userInput != 0);
    }
}
