public class Arrange {
    public static int[] rearrange(int[] array) {
        for (int index = 0; index < array.length; index++) {
            for (int indexs = index + 1; indexs < array.length; indexs++) {
                if (array[index] > array[indexs]) {
                    
                    array[index] = array[index] + array[indexs];
                    array[indexs] = array[index] - array[indexs];
                    array[index] = array[index] - array[indexs];
                }
            }
        }
        return array;
    }

	public static int MaxMin(int[] numbers){

		
		int secondMaximum = numbers[0];
		int maximum = numbers[0];
		for ( int i = 0; i < numbers.length; i++){
			if (- numbers[i] > maximum ){
			if (numbers[i] > maximum ){
				secondMaximum = maximum;
				maximum = numbers[i];
		} else if (numbers[i] > secondMaximum){
			secondMaximum = numbers[i];		
			}
			}
}
			return maximum * secondMaximum;
}


}
