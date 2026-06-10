package bank.operation;
import bank.model.Account;
public class Transfer 
{
    public void transfer(Account sender, Account receiver, double amount) 
    {
        if(amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else if(sender.getBalance() >= amount) {

            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);

            System.out.println("₹" + amount + " transferred successfully.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
}