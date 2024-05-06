
public class JavaScriptA {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 1, 6};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = sum - numbers[i];
        }

        System.out.print("Result array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
