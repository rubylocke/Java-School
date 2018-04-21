
/**
 * ArrayCombo here.
 * 
 * combination of R6.3 and R6.6
 *  
 * 
 * Answer to R6.3
 * R6.3 A: 111111111
 * R6.3 B: 111111111
 * R6.3 C: 111111111
 * R6.3 D: 111111111
 * R6.3 E: 2345678910
 * R6.3 F: 030507090
 * R6.3 G: 030510305
 * R6.3 H: 000010305
 * 
 * Question R6.6
 *   What is wrong with the arrays
 *   First problem:  array is only ten in length 
 *     but the FOR looks for a digit <= 10,
 *     meaning we have a out of bounds.
 *   *
 *   Second problem:  we do not give the array a length, 
 *     but then we asked the FOR to go the distance (bad joke)
 *     Hence, it does not know the distance (the lenght).
 *     
 * Ruby-Anne Locke, March 3, 2016, rubylocke@hotmail.com
 */

import java.util.Scanner;

public class ArrayCombo
{
      public static void main(String[] args)
   {
      // This is R6.3
       
      // An array of five values, initialized in a loop

      int[] a = {1,2,3,4,5,4,3,2,1,0};

      // a 
      for (int i = 1; i < 10; i++)
      {
         a[i] = a[i - 1];
      }
      // display contents of array
      System.out.print("R6.3 A: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // b
      for (int i = 9; i > 0; i--)
      {
         a[i] = a[i - 1];
      }
      System.out.print("\nR6.3 B: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // c
      for (int i = 0; i < 9; i++)
      {
         a[i] = a[i + 1];
      }
      System.out.print("\nR6.3 C: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // d
      for (int i = 8; i >= 0; i--)
      {
         a[i] = a[i + 1];
      }
      System.out.print("\nR6.3 D: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // e
      for (int i = 1; i < 10; i++)
      {
         a[i] = a[i] + a[i - 1];
      }
      System.out.print("\nR6.3 E: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // f
      for (int i = 1; i < 10; i = i + 2)
      {
         a[i] = 0;
      }
      System.out.print("\nR6.3 F: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // g
      for (int i = 0; i < 5; i++)
      {
         a[i + 5] = a[i];
      }
      System.out.print("\nR6.3 G: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }


      // h
      for (int i = 1; i < 5; i++)
      {
         a[i] = a[9 - 1];
      }
      System.out.print("\nR6.3 H: ");
      for (int i = 1; i < 10; i++)
      {
         System.out.print(a[i]);
      }

      System.out.println("\n\n   --- R6.3 Finish --- ");
      
      /**
       * *  Question R6.6
       *  What is wrong with the arrays
       *
       *First problem:  array is only ten in length 
       *     but the FOR looks for a digit <= 10,
       *     meaning we have a out of bounds.
       *
       *Second problem:  we do not give the array a length, 
       *    but then we asked the FOR to go the distance (bad joke)
       *    Hence, it does not know the distance (the lenght).
       */

      System.out.println("   Playing around with R6.6 Problem");

      // a 
      int[] values = new int[11];       // array is only 10 in length....starts with 2nd position
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

      System.out.println("   ----------  Finish  -----------");
   }
}
