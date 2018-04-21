
/**
*  Question R6.6
*  What is wrong with the arrays
*
* Ruby-Anne Locke, March 2, 2016, rubylocke@hotmail.com
*/

import java.util.Scanner;

public class ArrayProblems
{
   public static void main(String[] args)
   {
      // a 
      int[] values = new int[11];       // array is only 10 in length....starts with position 2
                                        // out of bounds
      for (int i = 1; i <= 10; i++)
      {
         values[i] = i * i;
      }



      // b
      int[] values1 = new int[10];                     // added  = new int[10];
      for (int i = 0; i < values1.length; i++)    // lenght not define  values not initialize
      {
         values1[i] = i * i;
      }

      System.out.println("/n   Program Finish");

   }
}

