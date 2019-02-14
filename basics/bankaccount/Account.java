
/**
 * This is the account class for our bank account
 *
 * @Leslie
 * @1.0
 */
public class Account
{
    // instance variables
    private double balance;
    private double remainder;
    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        balance = 0.00;
        remainder = 0;
    }

    /**
     * deposit money into account
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    /**
     * withdraw money from account
     */
    public void withdraw(double amount)
    {
        if (amount <= balance) {
                balance = balance - amount;
        }
        else {
                System.err.println("Transaction Declined");
                remainder = balance - amount;
                System.out.println("Your balance would have been " + remainder);
        }
    }
    
    /**
     * Get balance
     */
    public double getBalance()
    {
        return balance;
    }
}
