public class Bank{

public static void main(String...a){

Account mercyAccount = new Account();

mercyAccount.deposit(1_200);
int accountBalance = mercyAccount.checkBalance();


Account shakiraAccount = new Account();
shakiraAccount.deposit(4_300);
int herAccountBalance = shakiraAccount.checkBalance();


System.out.println("shakira balance is " + herAccountBalance);
System.out.println("mercy balance is " + accountBalance);


}
}