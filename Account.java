
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    private double balance;
    
    public Account()
    {
        balance = 0.00;
    }

    // Deposit
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    // Withdrawal
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    //Get Balance
    public double getBalance()
    {
        return balance;
    }
}
