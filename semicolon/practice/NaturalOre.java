import java.util. Scanner;
public class NaturalOre{
public static void main (String [] args) {
Scanner input = new Scanner(System.in);

int counter = 1;
int sum = 0;
System.out.println(" 10 natural numbers: ");

while (counter <= 10) {
System.out.println( counter + " " );
sum += counter;
counter++;
}
System.out.println("\nThe sum of the 10 natural numbers is:" + sum);
}
}
