import java.util.Scanner;
public class Maxi{
 public static void main(String... args){
  Scanner input = new Scanner(System.in);
   System.out.println("enter a value: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

double result = maximum(number1, number2, number3);

System.out.printf("maximum result is: ", result);
return maximumValue();

}
}