import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
public class SemicolonOre {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
       List<String> item = new ArrayList<>();
	Date date = new Date();

  System.out.print("Enter customer name: ");
  String name = scanner.nextLine();

  System.out.print("Enter cashier name: ");
  String cashierName = scanner.nextLine();

  String addMore;
  double total = 0;

  do {

      System.out.print("What did the user buy?: ");
      String itemName = scanner.nextLine();

      System.out.print("How many pieces?: ");
      double quantity = scanner.nextInt();

      System.out.print("How much per unit?: ");
      double pricePerUnit = scanner.nextDouble();

      total += quantity * pricePerUnit;

      item.add("\t" + itemName + "\t" + quantity + "\t" + pricePerUnit + "\t" + quantity * pricePerUnit);

      System.out.println("Add more items? (yes/no)");
	scanner.nextLine();
      addMore = scanner.nextLine();

           } while (addMore.equalsIgnoreCase("yes"));
      
    String semicolon = """
                         SEMICOLON STORES
                         MAIN BRANCH
                         LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                         TEL: 03293828343
                         """;

     System.out.print(semicolon);
     System.out.println(cashierName);
     System.out.println(name);
     System.out.println("Date: " + date);
     System.out.println("=====================================================================");
     System.out.println("\tITEM-NAME\tQTY\tPRICE\tTOTAL");
	for (String items : item){
	   System.out.print(items);
}
     

     
   }

}