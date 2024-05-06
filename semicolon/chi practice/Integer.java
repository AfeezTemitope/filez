import java.util.Scanner;

public class Integer{
public static void main (String[]args){
Scanner input = new Scanner(System.in);

System.out.println("enter an integer: ");
int firstNumber = input.nextInt();

System.out.println("enter an integer: ");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
double average = (double) sum / 2;
int product = firstNumber * secondNumber;

System.out.print("sum of " + firstNumber + " and " + secondNumber +" is: ");
System.out.println( sum);

System.out.printf("average of  " + firstNumber + " and " + secondNumber + " is: %.2f ", average);


System.out.printf("product of " + firstNumber + " and " + secondNumber + " is: ", product);

}
}




