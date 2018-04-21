/**
 * LeapYear
 * P5.20 "Leap Year"
 * 
 * Determine if 'year' entered is a leap year
 * - year divided by 400 giving an integer is leap year
 * - year is dividable in half giving an integer, it might be a leap year
 *   with the exception of division by 100 (except for 400)
 * 
 * Ruby Locke, Feb 17, 21016, rubylocke@hotmail.com
 */
import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args)
   {  
      boolean LEAPYEAR = false;
       
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a 4 digit year value: ");
      int  numberEntered = in.nextInt();

      LEAPYEAR = isLeapYear(numberEntered);
      
      if (LEAPYEAR)
      {
         System.out.println(numberEntered + " is an even number");
      }
      else
      {
          System.out.println(numberEntered + " is an odd number");
      }
    }
    
    public static boolean isLeapYear(int value)
    {
         if ((value/400) * 400 == value)
         {
            return true;
         }
         else if ((value/100) * 100 == value)
         {
            return false;
         }
         else if ((value/2) * 2 == value)
         {
            return true;
         }
         else
         {
            return false;
         }
      }

   }
