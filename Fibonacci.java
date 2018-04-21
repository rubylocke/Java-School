
/**
 * Fibonacci
 * - enter a number
 * - calculate the Fibonacci number...
 *   ..integer n = 9, therefore the answer is 34
 * Ruby Locke, Feb 07, 2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a Integer Value : (0 to exit) "); 
        int numberInput = in.nextInt();
              
        while (numberInput != 0 )
          {
              int a = 1;
              int b = 1;
              int c = a + b;
              
              for (int x = 0; x < (numberInput - 1); x++)
              {
                 b = a;
                 a = c;
                 c = a + b;
              }
                
              System.out.println("Fibonacci score of " + numberInput + " is " + c + "\n");
              System.out.print("Enter a Integer Value : (0 to exit) "); 
              numberInput = in.nextInt();
          }
        System.out.println("DONE\n");
   }
    }