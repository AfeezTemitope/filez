import java.util.*;

public class EvenOddToOnesZeros {
    public static void main(String[] args) {
        int[] inputArray = {4, 5, 8, 8, 8, 2, 9};
        int[] outputArray = evenOddToOnesZeros(inputArray);
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Output array: " + Arrays.toString(outputArray));
    }

    public static int[] evenOddToOnesZeros(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) ? result[i] = 0 : result[i] = 1;

        }
        return result;
    }
}