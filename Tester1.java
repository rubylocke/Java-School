/**
 * Tester1
 * 
 * Ruby Locke, Feb 17, 21016, rubylocke@hotmail.com
 */
import java.util.Scanner;

public class Tester1
{
   public static void main(String[] args)
   {  
      double  numberEntered = 0.0;
   
      System.out.println("You will be asked to enter value.");
      System.out.println("Any value greater than 99 will end the requesting.");
      System.out.println(" "); 

      Scanner in = new Scanner(System.in);
      System.out.print("Please enter value: ");
      numberEntered = in.nextDouble();
      Moth gypsy = new Moth(numberEntered);
      System.out.println("  Moth is located initially at  " + numberEntered); 
      System.out.println("");
            
      while (numberEntered < 100)
      {
          System.out.print("Please enter value: ");
          numberEntered = in.nextDouble();
          gypsy.moveToLight(numberEntered);
          System.out.print("   new position is " + gypsy.getPosition());
          System.out.println("");
      }
      System.out.println("");
      System.out.println("  Moth is final location is  " + numberEntered); 
      System.out.println("");
      System.out.println("  Finished...Finished...Finished"); 
    }
}
