
/**
* P6.1  Array
*  - initialize an array with ten random integers
*  - print four lines of output containing:
*    .  Every element at an even index
*    .  Every even element
*    .  all elements in reverse order
*    .  Only the first and last element
*
* Ruby-Anne Locke, March 2, 2016, rubylocke@hotmail.com
*/

import java.util.Scanner;

public class ArrayRandom
{
   public static void main(String[] args)
   {
      // An array of ten integers
      int[] randomArray = new int[10];
      
      // Populate array with random integer values
      for (int x = 0; x < randomArray.length; x++)
      {
          int r = (int) (Math.random() * 999) + 1;
          randomArray[x] = r;
      }

       // Display every element of the array to be used for verifying other results.
      System.out.println("Complete Array Values for comparison with other results");         
      for (int i = 0; i < randomArray.length; i++)
      {
        System.out.print(" " + i + ") " + randomArray[i]);  
      }
      
      // Display every element at an even index.
      System.out.println("\n\nEvery element at an even index");         
      for (int i = 0; i < randomArray.length; i = i + 2)
      {
        System.out.print(" " + i + ") " + randomArray[i]);  
      }
      
      // Display every even element (and position)
      System.out.println("\n\nEvery even value ");         
      for (int i = 0; i < randomArray.length; i++)
      {
        if ((randomArray[i]/2) * 2 == randomArray[i])
        {
          System.out.print(" " + i + ") " + randomArray[i]);  
        }
      }
      
      // Display all elements in reverse order  ????
       for (int i = 10; i < randomArray.length; i--)
      {
        System.out.print(" " + i + ") " + randomArray[i]);  
      }
      
      // Display the first and the last of the array
      System.out.println("\n\nDisplay the first and last element of the array");         
      System.out.println(" " + "1st " + randomArray[0]);  
      System.out.println(" " + "10th " + randomArray[9]);  
 
      // Display all the max value and min value in the array 
      int largest = 0;
      int largestSeq = 0;
      int smallest = 99999;
      int smallestSeq = 0;
      System.out.println("\nDisplay the Largest Value and the Minimum Value of the array");  
       for (int i = 0; i < randomArray.length; i++)
      {
        if (randomArray[i] > largest)
        {
            largest = randomArray[i];
            largestSeq = i;
        }
        
        if (randomArray[i] < smallest)
        {
            smallest = randomArray[i];
            smallestSeq = i;
        }
        
      }
      System.out.println("The Largest value of the element " + largest + " located at " + largestSeq);  
      System.out.println("The Smallest value of the element " + smallest + " located at " + smallestSeq);  
   }
}

