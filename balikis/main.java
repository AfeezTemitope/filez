import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

System.out.println("how many numbers do u want to add to the list");
int count = scanner.nextInt();

        System.out.println("Enter numbers (type 'end' to finish):");
	
        for (int i = 0; i < count; i++) {
	int number = scanner.nextInt();
            
            numbers.add(number);
        }

        Collections.sort(numbers);

        System.out.println("Sorted numbers: " + numbers);
    }
}
