import java.util.Scanner;

public class PizzaAlero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slicesPerBoxForSapaSize = 4;
        int slicesPerBoxForSmallMoney = 6;
        int slicesPerBoxForBigBoys = 8;
        int slicesPerBoxForOdogwu = 12;
	int totalBoxNeeded = 0;
	int pricePerSapa = 2000;
	int pricePerSmallMoney = 2400;
	int pricePerBigBoys = 3000;
	int pricePerOdogwu = 4200;
        int price = 1;
        int numberOfSlicesLeft = 0;

        System.out.println("Welcome to Lero's Pizza Hut");

        System.out.print("What type of pizza: ");
        String typeOfPizza = scanner.nextLine();

        System.out.print("Number of people: ");
        int numberOfPeople = scanner.nextInt();

        int numberOfBox = 0; // Initialize numberOfBox

        if (typeOfPizza.equals("Sapa size")) {
            numberOfBox = numberOfPeople / slicesPerBoxForSapaSize;
            System.out.println("Number of boxes of pizza to buy = " + numberOfBox);
        } else if (typeOfPizza.equals("Small Money")) {
            numberOfBox = numberOfPeople / slicesPerBoxForSmallMoney;
            System.out.println("Number of boxes of pizza to buy = " + numberOfBox);
        } else if (typeOfPizza.equals("Big boys")) {
            numberOfBox = numberOfPeople / slicesPerBoxForBigBoys;
            System.out.println("Number of boxes of pizza to buy = " + numberOfBox);
        } else if (typeOfPizza.equals("Odogwu")) {
            numberOfBox = numberOfPeople / slicesPerBoxForOdogwu;
            System.out.println("Number of boxes of pizza to buy = " + numberOfBox);
        }

        // Calculate price based on the type of pizza and number of boxes
        if (typeOfPizza.equals("Sapa size")) {
            price = numberOfBox * pricePerSapa;
        } else if (typeOfPizza.equals("Small Money")) {
            price = numberOfBox * pricePerSmallMoney;
        } else if (typeOfPizza.equals("Big boys")) {
            price = numberOfBox * pricePerBigBoys;
        } else if (typeOfPizza.equals("Odogwu")) {
            price = numberOfBox * pricePerOdogwu;
        }

        System.out.println("Price = " + price);
    }
}
