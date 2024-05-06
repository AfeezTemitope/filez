import java.util.Scanner;
public class FactorFinder {
public static void main(String... args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a positive integer: ");
int number = scanner.nextInt();

int factor = 0;
int i = 1;

while(i <= number){
if (number % i == 0){
factor++;
}
i++;
}
System.out.println(factor);
}
}