/**
 * Averageof3Numbers
 * Question P5.1
 * 
 * Return the average of three numbers
 * 
 * Ruby-Anne Locke, Feb 10, 2016, rubylocke@hotmail.com 
 */
import java.util.Scanner; 

public class Averageof3Numbers
{
    public static void main(String[] args) 
   {
    // variables 
    final int ITERATIONMAX = 3;
    double sum = 0;
    // int numOfFactors = 0;
    Scanner in = new Scanner(System.in); 
      
      for (int x = 0; x < ITERATIONMAX; x++)
      {
         System.out.print("Enter a Integer Value : "); 
         int numberInPut = in.nextInt();
         sum = sum + numberInPut;
      }
      
      System.out.print("The average of these three numbers: " + averageFigure(sum, ITERATIONMAX));
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
