
/**
 * Write a description of class BankMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankMain
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        Account customer1 = new Account(); //Create account object
        customer1.deposit(500);
        customer1.withdraw(50);
        
        Account customer2 = new Account(); //Create account object
        customer2.deposit(200);
        customer2.withdraw(205);
        
        System.out.println("Customer 1 balance");
        System.out.println(customer1.getBalance());
        System.out.println("Customer 2 balance");
        System.out.println(customer2.getBalance());
        
        
    }
}
