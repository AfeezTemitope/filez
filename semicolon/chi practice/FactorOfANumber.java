import java.util.Scanner;

public class FactorOfANumber {
public static void main(String... args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int number = input.nextInt();

int i = 1;
int factor = 0;
while (i <= number){
if (number % i == 0 ){
factor++;
System.out.println("Factors are: " + factor + " ");

}
i++;
}

}
}