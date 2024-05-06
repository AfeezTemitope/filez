
import java.util.Scanner;

public class NumberCollector{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int [] age = new int[5];

	for(int counter = 0; counter < 5; counter++){

		System.out.print("enter age:");
		age [counter] = input.nextInt();
		
	}
	for(int counter = 0; counter < 5; counter++){

		System.out.println(age[counter]);
	}


} 


}