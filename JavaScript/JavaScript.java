import java.util.*;
	public class JavaScript{
		public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int total = 0;



int arr[] = {2,4,5,1,6};


for (int i = 0; i < 5; i++){
arr [i] = scanner.nextInt();
}
for ( int number : arr){
total += number; 
}
System.out.print(total);
	
}		}