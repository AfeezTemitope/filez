import java.math.*;

public class Test {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1234567890");
        BigInteger bi2 = new BigInteger("9876543210");
        BigInteger sum = bi1.divide(bi2);
        System.out.println("The sum of " + bi2 + " and "+ bi2+ " is " + sum);
    }
}
