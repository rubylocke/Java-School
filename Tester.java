/**
 * Tester
 * 
 * Ruby Locke, Feb 17, 21016, rubylocke@hotmail.com
 */
import java.util.Scanner;

public class Tester
{
   public static void main(String[] args)
   {  
      boolean LEAPYEAR = false;
       
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter value: ");
      double  numberEntered = in.nextDouble();
      
      Moth gypsy = new Moth(numberEntered);
      System.out.println("  position entered is " + numberEntered); 
      
      System.out.print("Please enter value: ");
      numberEntered = in.nextDouble();
      
      System.out.println("  move by dividable by two " + numberEntered/2);    // to be deleted
      gypsy.moveToLight(numberEntered);
      System.out.println("   new position is " + gypsy.getPosition());
      
      System.out.print("Please enter value: ");
      numberEntered = in.nextDouble();
      System.out.println("  move by dividable by two " + numberEntered/2);    // to be deleted
   
      gypsy.moveToLight(numberEntered);
      System.out.println("   new position is " + gypsy.getPosition());
      
      System.out.print("Please enter value: ");
      numberEntered = in.nextDouble();
      System.out.println("  move by dividable by two " + numberEntered/2);    // to be deleted
   
      gypsy.moveToLight(numberEntered);
      System.out.println("   new position is " + gypsy.getPosition());
   }
}
