public class Firee{
 public static int[] doubleArray(int[] numbers) {
        int[] result = new int[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i];
            result[i + numbers.length] = numbers[i] * 2;
        }
        return result;
    }

}