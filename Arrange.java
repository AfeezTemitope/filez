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
}




