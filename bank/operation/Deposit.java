package bank.operation;
import bank.model.Account;
public class Deposit {

    public void deposit(Account account, double amount) {
        if(amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}