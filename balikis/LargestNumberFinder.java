import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();

        System.out.println("Enter numbers (type 'end' to finish):");
        while (scanner.hasNextInt()) {
            myList.add(scanner.nextInt());
        }

        Integer largest = ArraySnacks.largestElement(myList);
        System.out.println("The largest element in the list is: " + largest);
    }
}
