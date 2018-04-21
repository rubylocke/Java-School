/**
 * Averageof3Numbers
 * Question P5.1
 * 
 * Return the average of three numbers
 * 
 * Ruby-Anne Locke, Feb 10, 2016, rubylocke@hotmail.com 
 */
import java.util.Scanner; 

public class AverageOfValues
{
   public static void main(String[] args)     
   {
       // variables
       double total = 0;      // will hold the sum of all numbers entered
       int numOfValues = 0;   // will hold the numbers entered
       double amt = 0;
       
       do
       {
         amt = enterValue();
         numOfValues++; 
       }
       while (amt == 0);
    
       System.out.print("Average of variables entered" + averageFigure(amt, numOfValues)); 
    } 
   /**
    * Input return
    *  ask for input
    * @param  none
    * @return    :  return what was entered
    */
   public static double enterValue()
   {
      Scanner in = new Scanner(System.in); 
      System.out.print("Enter a : "); 
      double valueInput = in.nextDouble();
      return valueInput;
   }
   /**
    * Average Calculator
    *  give the total value and the number of values
    * @param  sum:  total value
    * @param  num:  total number of values
    * @return    :  return the average 
    */
   public static double averageFigure(double sum, int num)
   {
      double averageCalc = sum/num;
      return averageCalc;
   }
}

