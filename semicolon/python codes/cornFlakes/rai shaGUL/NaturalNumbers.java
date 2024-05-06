public class NaturalNumbers {
public static void main(String... args) {
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("Sum of the first 10 natural numbers %d%n: ", sum);
    }
}