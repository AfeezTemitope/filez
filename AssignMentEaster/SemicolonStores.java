import java.util.*;

public class SemicolonStores{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);
		System.out.print("What is the customer's name ? : ");
			String customerName = scanner.nextLine();
	String decisionMade;
	do {
		System.out.print(" ");
			String blank = scanner.nextLine();
		System.out.println("What did user buy ?");
			String goodsPurchased = scanner.nextLine();
		System.out.println("how many pieces ? ");
			int quantity = scanner.nextInt();
		System.out.println("How much per unit ? ");
			int pricePerUnit = scanner.nextInt(); 
		System.out.println("Add more items ?(yes / no): ");
			 decisionMade = scanner.next();

		} while(decisionMade.equalsIgnoreCase("yes"));

System.out.print(" ");
			String blan = scanner.nextLine();
System.out.println("What is your name  ? ");
	String nameOfCashier = scanner.nextLine();

System.out.println("How much discount will He/She get ? ");
	int customerDiscount = scanner.nextInt();





System.out.print("\n\nSemicolon stores\nMain  Branch\nLocation: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.\nTel : 03293828343\nDate : 18 - Dec - 22 8 : 48 : 11 pm");
System.out.print("\nCashier  : " + nameOfCashier);
System.out.print("\nCustomer Name  : " + customerName);
System.out.print("\n\n==============================================================");

System.out.println("\tITEM\tQTY\tPRICE\tTOTAL(NGN)\n");
System.out.println("\t" + goodsPurchased + "\t"+ quantity + "\t" + goodsPurchased * quantity);












}



}