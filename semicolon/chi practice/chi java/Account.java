public class Account{



private int balance;

public void deposit(int amount){

if ( amount > 0) balance += amount;

}
public void withdrawal(int amount){

if (amount < balance ) balance -= amount;

}
public int checkBalance(){

return balance;

}


}