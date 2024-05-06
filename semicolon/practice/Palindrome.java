import java.util.Scanner;
public class Palindrome{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("***********************");
System.out.println("WELCOME TO PALINDROMES");
System.out.println("***********************");
System.out.println("enter a number between 1000 - 9999: ");
int userNumber = input.nextInt();

int thousand = userNumber / 1000;
int hundred = (userNumber / 100) % 10;
int tens = (userNumber / 10) % 10;
int unit = (userNumber % 10);

int sum = thousand + hundred + tens + unit;


System.out.println("*******************************");
System.out.println("total sum of integer " + userNumber + " is " + sum);
System.out.println("*******************************");

}
}

