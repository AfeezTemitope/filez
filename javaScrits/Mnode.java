public class Mnode {
    public static void main(String... args) {
        int[] numbers = {1, 2,2,3,4};
        int maximumCount = 0;
        int mode = numbers[0];
	int count = 0;

		for (int i = 0; i < numbers.length; i++) {
	
		for (int j = 0; j < numbers.length; j++) {
		if (numbers[j] == numbers[i]) {
		count++;
}
}
	if (count > maximumCount) {
	maximumCount = count;
	mode = numbers[i];
}
}

        System.out.println("Mode of the array is: " + mode);
    }
}
