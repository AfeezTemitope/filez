import java.util.Scanner;

public class ArraySumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println("Sum of the elements in the array: " + sum);

    }
}
