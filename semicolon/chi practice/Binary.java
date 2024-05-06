import java.util.Scanner;
public class Binary{
public static void main (String... args) {
Scanner scanner = new Scanner(System.in);

int i = 0;

   System.out.println("*****************************");
   System.out.println("welcome to binary hub");
   System.out.println("*****************************");
   System.out.println("how many times would you like to play");
   int playTime = scanner.nextInt();

while ( i < playTime ){

System.out.print("enter a number between 0 & 1: ");
int Number = scanner.nextInt();




 if (Number == 0)
System.out.println("1");
System.out.println("**********");
 if ( Number == 1)
System.out.println("0");

i++;
}

}

}


