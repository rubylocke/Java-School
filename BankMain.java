
/**
 * Write a description of class BankMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankMain
{
   public static void main(String[] args)
   {
       //Create cust1
       Account cust1 = new Account();   // create an account object
       cust1.deposit(500);
       
       //Create cust2
       Account cust2 = new Account();
       cust2.deposit(100);
       
       System.out.println(cust1.getBalance());
       System.out.println(cust2.getBalance());
}
}
