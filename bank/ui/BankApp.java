package bank.ui;
import java.util.*;
import bank.model.Account;
import bank.model.Customer;
import bank.operation.Deposit;
import bank.operation.Withdraw;
import bank.operation.Transfer;
public class BankApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer("Rabin Pal", "9876543210");

        Account acc1 = new Account(1001, "Rabin Pal", 10000);
        Account acc2 = new Account(1002, "Second User", 5000);

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        Transfer transfer = new Transfer();

        int choice;
        do {
            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. View Customer");
            System.out.println("2. View Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    customer.displayCustomer();
                    break;

                case 2:
                    acc1.displayAccount();
                    break;

                case 3:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    deposit.deposit(acc1, dep);
                    break;

                case 4:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    withdraw.withdraw(acc1, wd);
                    break;

                case 5:
                    System.out.print("Enter transfer amount: ");
                    double tr = sc.nextDouble();
                    transfer.transfer(acc1, acc2, tr);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } 
        while(choice != 6);
        sc.close();
    }
}