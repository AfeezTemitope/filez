import java.util.Scanner;

public class LargestSmallest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
int counter = 1;
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

while (counter <= 10) {
System.out.print("Enter integer: " + counter + ": ");
int number = input.nextInt();
            
if (number > largest) {
secondLargest = largest;
largest = number;

} else if (number > secondLargest) {
secondLargest = number;
}

counter++;

}
System.out.println("The largest integer entered is: " + largest);
System.out.println("The second largest integer entered is: " + secondLargest);
input.close();
}
}