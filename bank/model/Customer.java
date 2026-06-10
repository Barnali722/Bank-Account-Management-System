package bank.model;
public class Customer
 {
    private String customerName;
    private String phone;

    public Customer(String customerName, String phone) 
    {
        this.customerName = customerName;
        this.phone = phone;
    }

    public void displayCustomer() 
    {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Name  : " + customerName);
        System.out.println("Phone : " + phone);
    }
}