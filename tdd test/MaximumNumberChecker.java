public class MaximumNumberChecker {

	public static int maximumNumberFinder (int[] numbers){
		if (numbers == null || numbers.length == 0 ){
			throw new IllegalArgumentException("Array is empty or null");
		}
		int maximum = numbers[0];
		for (int num : numbers) {
			if (num > maximum ){
				maximum = num;
		}
			}
		return maximum;
	}



}