package bank.operation;
import bank.model.Account;
public class Withdraw 
{
    public void withdraw(Account account, double amount) 
    {
        if(amount <= 0) 
        {
            System.out.println("Invalid amount.");
        }
        else if(account.getBalance() >= amount) 
        {
            account.setBalance(account.getBalance() - amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient Balance.");
        }
    }
}