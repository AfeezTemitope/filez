import java.util.Scanner;
public class AddUp{
public static void main(String... args){
Scanner s = new Scanner(System.in);

System.out.println("Enter the number between 0 and 9999: ");  
int number = s.nextInt(); 
int first = (number / 1000);
int second = (number / 100) % 10;
int third = (number / 10) % 10;
int fourth = (number % 10);

int total = first + second + third + fourth;

System.out.printf("sum of digit is: %d", total);
}
}