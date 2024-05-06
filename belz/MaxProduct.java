public class MaxProduct{

public static int findMaxProduct(int[] numbers) {
    int maxPositive = Integer.MIN_VALUE; 
    int maxNegative = Integer.MIN_VALUE; 

    for (int num : numbers) {
        if (num >= 0) {
            
            maxPositive = Math.max(maxPositive, num);
        } else {
           
            maxNegative = Math.max(maxNegative, num);
        }
    }

 
    int product = maxPositive * maxNegative;

    return product;
}
}
