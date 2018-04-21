/**
*  Question R6.3
*  Playing with arrays
* and display results
*
* Ruby-Anne Locke, March 2, 2016, rubylocke@hotmail.com
*/

import java.util.Scanner;

public class ArrayCalcs
{
   public static void main(String[] args)
   {
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

      System.out.println("\n   Program Finish");

   }
}

