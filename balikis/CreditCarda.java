import java.util.*;

public class CreditCarda{
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Kindly enter your card details to confirm: ");
        String cardNumber = input.nextLine();

        if (cardNumber.length() < 13 || cardNumber.length() > 16){
            System.out.println("invalid credit card number!");
        } else{
            String cardType;
            if (cardNumber.startsWith("4")){
                cardType = "visa";
            }else if (cardNumber.startsWith("5")){
                cardType = "MasterCard";
            } else if (cardNumber.startsWith("37")){
                cardType = "American Express";
            } else if (cardNumber.startsWith("6")){
                cardType = "Discover";
            }else { 
                cardType = "unknown";
            }

int digit = 0;
int evenNumber = 0;
int oddNumber = 0;

for ( int i = 0; i < cardNumber.length(); i++){
if ( i % 2 == 0 ){
 digit = 2 * Character.getNumericValue(cardNumber.charAt(i));
 evenNumber += ( digit / 10 ) + ( digit % 10);
}
n
if ( i % 2 != 0){
 oddNumber += Character.getNumericValue(cardNumber.charAt(i));

}
}

int totalSum = oddNumber + evenNumber;

if ( totalSum % 10 == 0){
        
            System.out.println("Credit Card Type: " + cardType);
	    System.out.println("Credit Card Number: " + cardNumber);
	    System.out.println("Credit Card Length: " + cardNumber.length());
	    System.out.println("Credit Card Validity Status: valid");
	  
} else {
	    System.out.println("Credit Card Type: Invalid card");
	    System.out.println("Credit Card Number: " + cardNumber);
	    System.out.println("Credit Card Length: " + cardNumber.length());
	    System.out.println("Credit Card Validity Status: invalid");


}
 }
}
}