import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class CheckOutE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	Date date = new Date ();

        String sales;

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> qtys = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> totals = new ArrayList<>();

        double subTotal = 0;

	System.out.println("Cashier name:");
        String name = input.nextLine();
        System.out.println("Customer's name:");
        String customer = input.nextLine();

        do {
            System.out.println("\nWhat did the user buy?");
            String product = input.nextLine();
            products.add(product);

            System.out.println("How many pieces?");
            double qty = input.nextDouble();
            qtys.add(qty);

            System.out.println("How much per unit?");
            double price = input.nextDouble();
            prices.add(price);

            double total = qty * price;
            totals.add(total);

            subTotal += total;

            System.out.print("Do you need more items,Yes or No?");
            sales = input.next();
            input.nextLine();

        } while (sales.equalsIgnoreCase("Yes"));

        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACUALEY WAY, SABO YABA, LAGOS");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + date);
        System.out.println("Cashier name: " + name);
        System.out.println("Customer's name: " + customer);


        String line = "==============================================================";
        System.out.println(line);
        System.out.printf("%8s %8s %8s %10s\n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");

        String menu = "--------------------------------------------------------------";
        System.out.println(menu);

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%8s %8.2f %8.2f %8.2f\n", products.get(i), qtys.get(i), prices.get(i), totals.get(i));
        }

        System.out.println(menu);
        System.out.printf("%24s  %8.2f\n", "SubTotal", subTotal);
    }
}
