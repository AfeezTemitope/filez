import java.util.Scanner;
public class Numbers{
public static void main(String[]args){
Scanner input = new Scanner (System.in);
System.out.print("enter first number");
int num1 = input.nextInt();
System.out.print("enter second number");
int num2 = input.nextInt();
System.out.print("enter third number");
int num3 = input.nextInt();

int sum = num1+num2+num3;
int average = sum/3;
int product = num1*num2*num3;
int smallest = Math.min(num1,num2,num3);
int largest = Math.max(num1,num2,num3);

System.out.println("Sum:" +sum);
System.out.println("Average:" +average);
System.out.println("Product:" +product);


}


}






