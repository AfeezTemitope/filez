import java.util.Scanner;
public class NamePrice{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println(" enter price of goods: ");
int price = input.nextInt();

double outputDiscountedPrice = price * 0.10;
double discountedPrice = price - outputDiscountedPrice;

System.out.printf("the discounted price for is %.2f%n ", discountedPrice );


}
}