
public class MaxProductCalculator {
    public static void main(String[] args) {
        int[] numbers = {5, -2, -10, -8, 3};
        int result = findMaxProduct(numbers);
        System.out.println("The maximum product is: " + result);
    }

    public static int findMaxProduct(int[] numbers) {
        int secondMaximum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                secondMaximum = maximum;
                maximum = numbers[i];
            } else if (numbers[i] > secondMaximum) {
                secondMaximum = numbers[i];
            }
        }

        return maximum * secondMaximum;
    }
}
