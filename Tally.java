/**
   This class models a tally counter.
*/
public class Tally
{
   private int value;

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void count() 
   {
      value = value + 1;
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
   
   /**
      Undo
   */
   public void undo()
   {
      if (value > 1)
      {
         value = value - 1;
      }
      else
      {
          System.out.println("cannot undo");
        }
        
   }
}
