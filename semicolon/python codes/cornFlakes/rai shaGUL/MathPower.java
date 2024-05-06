public class MathPower {
public static void main(String... args) {

        System.out.println("a\tb\tpow(a, b)");
        for (int i = 1; i <= 5; i++) {
            int j = i + 1;
            int result = (int)Math.pow(i, j);
            System.out.println(i + "\t" + j + "\t" + result);
        }
    }
}