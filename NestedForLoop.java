/**
 * Example of Nested For Loop
 *  Required:  Create a set of numbers from 1 to 4 twice.
 *  1) use nested For loops
 *  2) use nested while loops
 *  3) use nexted do while loops
 *  
 * Ruby-Anne Locke, Feb 3,2016, rubylocke@hotmail.com
 */

public class NestedForLoop
{ 
   public static void main(String[] args) 
   { 
      // set up loop iterations
      final int outSideLoop = 2;
      final int inSideLoop = 4;
       
      // Use FOR Loop
      // print table header
      System.out.println("       FOR ");
      System.out.println("Outside   Inside");
      System.out.println(" Loop      Loop");
      System.out.println(" Value     Value");
        
      for (int x = 0; x < outSideLoop; x++)
      {
             // print inner table
             for (int y = 0; y < inSideLoop; y++)
             {
                 System.out.println("   " + (x + 1) + "         "  + (y + 1));
             }
      }
      
      // Use WHILE Loop
      // print table header
      System.out.println("\n     WHILE");
      System.out.println("Outside   Inside");
      System.out.println(" Loop      Loop");
      System.out.println(" Value     Value");
      
      final int STARTPOSITION = 1;
      int startOuter = 0;
      while (startOuter < outSideLoop)
      {
          int startInner = 0;
          while (startInner < inSideLoop)
          {
             System.out.println("   " + (startOuter + 1) + "         "  + (startInner + 1));
             startInner++;
          }
          startOuter++;
      }
      
       // Use DO WHILE Loop
      // print table header
      System.out.println("\n  DO WHILE");
      System.out.println("Outside   Inside");
      System.out.println(" Loop      Loop");
      System.out.println(" Value     Value");

      int counterOuter = 0;
      
      do
      {
          int counterInner = 0;
          do
          {
              System.out.println("   " + (counterOuter + 1) + "         "  + (counterInner + 1));
              counterInner++;
          }
          while ( counterInner < 4 );
          counterOuter++;
        }
        while ( counterOuter < 2 );    
   }
}

       