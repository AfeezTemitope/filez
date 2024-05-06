import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String... args) {

Scanner input = new Scanner(System.in);

System.out.print("enter number of element");
int numberOfElement = input.nextInt();

int[] age = new int[numberOfElement];


System.out.println("value for arrays");
for (int i = 0; i < numberOfElement; i++){
	System.out.print("Element " + (i+1) + ": ");
	age[i] = input.nextInt();
}


System.out.println("Using for each loop:");
for (int i = 0; i < numberOfElement; i++){
	System.out.print(age[i]);
if (i < numberOfElement - 1){
	System.out.print(", ");
}
}
}
}

