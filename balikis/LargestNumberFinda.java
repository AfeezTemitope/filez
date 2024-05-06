import java.util.Scanner;
public class LargestNumberFinda {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
	System.out.print("array element " +  (i + 1) + " :");
            number[i] = scanner.nextInt();
        }

        Integer largest = ArraySnack.largestElement(number);
        System.out.println("The largest element in the array is: " + largest);
    }
}