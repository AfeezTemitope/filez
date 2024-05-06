import java.util.Scanner;
public class Text{
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("****");
        System.out.println(text.length());
        System.out.println("****");
    }
}