/**
 * Odd or Even
 *  Intake a integer and state whether it is odd or even
 *  
 *  Iterate for five times with counters for total number of even and total number of odd
 *  For each loop: 
 *     1) Request integer
 *     2) Determine if integer is odd or even
 *     3) Display integer and if is odd or even
 *     4) If integer is odd, add 1 to odd counter
 *     5) If integer is even, add 1 to even counter
 *  At end of iteration, display "DONE" and the numbers in counters
 *  
 * Ruby-Anne Locke, Feb 3,2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 

public class OddEven
{ 
   public static void main(String[] args) 
   { 
      // define counters
      int counterEven = 0;
      int counterOdd = 0;

      Scanner in = new Scanner(System.in); 

       //  set up loop
      final int ITERATIONMAX = 5; 
      // boolean oddType = true;
       
      for (int x = 0; x < ITERATIONMAX; x++)
         {
            System.out.print("Enter a Integer Value : "); 
            int numberInPut = in.nextInt();
     
            if (numberInPut == ((numberInPut / 2) * 2))
            {
                System.out.println("The integer " + numberInPut + " is even.\n");
                counterEven++;
            }
            else
            {
               System.out.println("The integer " + numberInPut + " is odd.\n");
               counterOdd++;
            }
          }
         
      System.out.println("DONE   The total even numbers are " + counterEven + ".");
      System.out.println("       The total odd  numbers are " + counterOdd + ".");
    }
}
       