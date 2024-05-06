import java.util.Scanner;
public class CornFlakes{
public static void main(String...args){

Scanner input = new Scanner(System.in);

int c = 50;
int h = 30;
System.out.println("enter a value");
int d = input.nextInt();

int values = (2 * c * d) / h;
double q = Math.sqrt((values));

System.out.printf("the result is %.2f%n: ", q);

}
}