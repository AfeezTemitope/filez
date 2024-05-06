import java.util.Scanner;
import java.util.Date;

public class SemicolonStore {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is the customer's name");

        String customerName = input.next(); 
        String moreItems = " ";
        Date date = new Date();

        // Create a StringBuilder to store the items
        StringBuilder items = new StringBuilder();

        do{

            System.out.println("what did the user buy");

            String userBuy = input.next();

            System.out.println("how many pieces ? ");

            int pieces = input.nextInt();

            System.out.println("how much per unit?");

            int perUnit = input.nextInt();

            // Calculate total price
            int total = pieces * perUnit;

            // Append item details to the StringBuilder
            items.append(userBuy + "\t\t" + pieces + "\t\t" + perUnit + "\t\t" + total + "\n");

            System.out.println("add more items");

            moreItems = input.next();

            if(moreItems.equalsIgnoreCase("NO")){

                break ; }

        } while(moreItems.equalsIgnoreCase("YES")); 

        System.out.println("what is  your name: (cashierName)");

        String cashierName = input.next();

        System.out.println("how much discount will he get");

        String discount = input.next();

        String prompt ="""
            SEMICOLON STORE

            MAIN BRANCH

            LOCATION: 312 HERBERT MARCULAY WAY SABO YABA, LAGOS.

            TEL: 03293828343

            """;

        System.out.println(prompt);

        System.out.println("Date: " + date);

        System.out.println("CashierName: " + cashierName);

        System.out.println("CustomerName: " + customerName);

        String obaturn = """
        ============================================================================
            ITEMS\t\tQTY\t\tPRICE\t\tTOTAL(NGN)
        ---------------------------------------------------------------------------
        """;
        System.out.println(obaturn);

        // Print the items
        System.out.println(items.toString());

    }    
}
