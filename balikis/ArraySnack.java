
public class ArraySnack {


    public static int largestElement(int[] number) {
	int maximum = number[0];
    for (int i = 1; i < number.length; ++i) {
        if (number[i] > maximum) {
            maximum = number[i];
        }
    }
    return maximum;
}

    public static int reverseNumber(int number) {
        int reversed = 0;
	int contantNumber = 10;
        for (; number != 0; number /= contantNumber) {
            int digit = number % contantNumber;
            reversed = reversed * contantNumber + digit;
        }
        return reversed;
    }
}

