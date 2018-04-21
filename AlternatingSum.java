
/**
*  Question P6.6
*  Alternating Sum Calculations
*  Sum up the alternate numbers of an array
*
* Ruby-Anne Locke, March 27, 2016, rubylocke@hotmail.com
*/

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingSum
{
   public static void main(String[] args)
   {
      // An array of nine values, initialized in a loop
     int[] a = {1,4,9,16,9,7,4,9,11};
     double total = 0;
     
      for (int i = 0; i < 9; i++)
      {
         if (i == ((i/2) * 2))
         {
             total += a[i];
         }
         else
         {
            total -= a[i];    
         }
         // System.out.println("intermim  " + i + " value " + a[i] + " total " + total);
      }
      // display the contents of array
     System.out.println("The alternating total of array is " + total);
     
     //More enhnance version: 
     //   ask for numbers into array
     //   places values in an arraylist
     //   then does alternating summary
    
     // define array list
     ArrayList<Integer> values = new ArrayList<Integer>();
     
     //  reads inputs.  allows user to enter Q to quit
     System.out.println("Please enter values, Q to quit: " );
     Scanner in = new Scanner(System.in);
    // verify numeric value entered.  If so, add to the array
     while (in.hasNextInt())
     {
         values.add(in.nextInt());
     }
     
     double arrayTotal = 0;
     
      for (int i = 0; i < values.size(); i++)
      {
         if (i == ((i/2) * 2))
         {
             arrayTotal += values.get(i);
         }
         else
         {
            arrayTotal -= values.get(i);    
         }
         // System.out.println("intermim  " + i + " value " + a[i] + " total " + total);
      }
      // display the contents of array
     System.out.println("The alternating total of array is " + arrayTotal);    
    } 
}
