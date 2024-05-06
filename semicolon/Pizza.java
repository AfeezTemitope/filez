import java.util.Scanner;
	public class Pizza {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
		int slicesPerBox = 0;
		int slicesPerBoxForSapaSize = 4;
		int slicesPerBoxForSmallMoney = 6;
		int slicesPerBoxForBigBoys = 8;
		int slicesPerBoxForOdogwu = 12;
		int price = 0;		
		int numberOfPizza =0;
		int numberOfSlicesLeft = 0;
		int totalSliceNeeded;
		int totalSlicesAvailable;
		int numberOfBox = 0;
		int totalBoxNeeded = 0;
		int pricePerSapa = 2000;
		int pricePerSmallMoney = 2400;
		int pricePerBigBoys = 3000;
		int pricePerOdogwu = 4200;
		

		System.out.println("Welcome to Lero's Pizza Hut");
		

		System.out.printf("What type of pizza: ");
		String typeOfPizza = scanner.nextLine();

		System.out.println("Number of people: ");
		int numberOfPeople = scanner.nextInt();

		System.out.println("Number of People = " + numberOfPeople + ", " + "Pizza type = " + typeOfPizza);
	
		totalSliceNeeded = numberOfPeople;
		

		
		//totalBoxNeeded = totalSliceNeeded /slicesPerBox;
		//numberOfBox = numberOfPeople / slicesPerBox; 
		totalSlicesAvailable  = numberOfBox * slicesPerBox;
		totalSliceNeeded = numberOfPeople;
		//numberOfPizza = totalSliceNeeded / slicesPerBox;
		//numberOfPizza = numberOfPeople * typeOfPizza;
		numberOfSlicesLeft = (totalSlicesAvailable - totalSliceNeeded);
		price = (numberOfBox * price);

		
		
		if (typeOfPizza == "Sapa size");
			numberOfBox  = numberOfPeople /slicesPerBoxForSapaSize;
			System.out.println("Number of boxes of pizza to buy = " + numberOfBox);
			System.out.println("Number of leftover slices after serving = " + numberOfSlicesLeft);
			price = numberOfBox * pricePerSapa ;
			System.out.println("Price = " + price);


		if(typeOfPizza == "Small Money");
			numberOfBox = numberOfPeople / slicesPerBoxForSmallMoney;
			System.out.println("Number of boxes of pizza to buy = " + numberOfBox);	
			System.out.println("Number of leftover slices after serving = " + numberOfSlicesLeft);
			System.out.println("Price = " + price);
		
		if (typeOfPizza == "Big boys");
			numberOfBox = numberOfPeople / slicesPerBoxForBigBoys;
			System.out.println("Number of boxes of pizza to buy = " + numberOfBox);	
			System.out.println("Number of leftover slices after serving = " + numberOfSlicesLeft);
			System.out.println("Price = " + price);
		

		if(typeOfPizza == "Odogwu");
			numberOfBox = numberOfPeople / slicesPerBoxForOdogwu;
			System.out.println("Number of boxes of pizza to buy = " + numberOfBox);	
			System.out.println("Number of leftover slices after serving = " + numberOfSlicesLeft);
			System.out.println("Price = " + price);
		

		



}
}