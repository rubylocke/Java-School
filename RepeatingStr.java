/**
 * Question 5.5
 * Repeat a string n times
 *  
 * Ruby-Anne Locke, Feb 2,2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 

public class RepeatingStr
{ 
   public static void main(String[] args) 
   {
       // **METHOD** //
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a string ");
       String str = in.nextLine();
       System.out.print("Enter the number of times you want the string to repeat");
       int n = in.nextInt();


       System.out.println(repeat (str, n));
   }

      
   public static String repeat(String str, int n)
   {
      if (n == 0) return "";

      String return_str = "";
      for (int i = 0; i < n; i++)
      {
         return_str += str;
      }

        return return_str;
    }
}