import java.util.Scanner;
public class Max{
 public static void main(String... args){
  Scanner input = new Scanner(System.in);
   System.out.println("enter a value: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

double result = maximum(number1, number2, number3);
double minResult = minimum(number1, number2, number3);

System.out.println("maximum is:" + result);
System.out.println("minimum is:" + minResult);
}

public static double maximum(double x, double y, double z){
    double maximumValue = x;

  if (y > maximumValue)
     maximumValue = y;

  if (z > maximumValue)
maximumValue = z;

return maximumValue;

}

public static double minimum(double x, double y, double z){
double minimumValue = x;

if (y < minimumValue)
minimumValue = y;

if (z < minimumValue)
minimumValue = z;

return minimumValue;
}
}