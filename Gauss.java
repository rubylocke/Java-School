/**
 * Gauss
 *  Compute 1 + 2 + 3... + 100
 *  Add up numbers from 1 to 100 and display the output
 * Ruby-Anne Locke, Feb 2,2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 
public class Gauss
{ 
   public static void main(String[] args) 
   { 
//       boolean programContinue = true;
//       Scanner in = new Scanner(System.in); 
//       System.out.print("Enter C for Celsius or F for Fahrenheit  "); 
//       char temp = in.next().charAt(0); 
//              System.out.println("Temperature has to be \"F\" or \"C\""); 
         int calc = 0;
         int maxFactor = 101;
         for (int x = 1; x < maxFactor; x++)
         {
             calc = calc + x;
         }
         
         System.out.println("The total calculation of integer 1, 2, 3,...100 is " + calc);
    }
} 