/**
 *   Program to compute the first integral power to which 2 can be 
 *   raised that is greater than that multiple of a given integer.
 * 
 *   Ruby Locke, Feb 03, 2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 
public class CountPowerOf2
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter a number, 0 to quit: "); 
      int n = in.nextInt();

      //int i = 1; )
      //while (n * n > Math.pow(2, i)) 
      //{
      //   i++; 
      //}
      int i = 1;
       for (; n * n > Math.pow(2,i); i++)
      {
      }

      System.out.println("2 raised to " + i 
            + " is the first power of two greater than " + n + " squared"); 
   } 
}