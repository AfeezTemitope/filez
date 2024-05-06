import java.util.Scanner;
public class MortageClaculator{
public static void main(String... args){

Scanner input = new Scanner(System.in);


System.out.println("ENTER PRINCIPAL AMOUNT");
float principalAmount = input.nextFloat();

System.out.println("ENTER MONTHLY INTEREST");
float monthlyInterestRate = input.nextFloat();

System.out.println("ENTER LOAN DURATION");
int loanDuration = input.nextInt();

double numberOfMonth = loanDuration * 12;
double rate = (monthlyInterestRate / 12) / 100;
double numerator = rate * principalAmount * Math.pow((1 + rate), numberOfMonth);
double denominator = Math.pow((1 + rate), numberOfMonth) - 1;
double monthlyPayment = numerator / denominator;

System.out.printf("your monthly payment is: %.2f%n ", monthlyPayment);

}
}

