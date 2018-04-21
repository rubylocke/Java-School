/**
   This class demonstrates the Counter class.
*/
public class TallyDemo
{
   public static void main(String[] args)
   {
      Tally tally = new Tally();
      Tally sidedoor = new Tally();
      tally.count();
      tally.count();
      sidedoor.count();
      int result = tally.getValue();
      System.out.println("Value: " + result);
      result = sidedoor.getValue();
      System.out.println("Value of sidedoor: " + result);
      tally.reset();
      tally.count();
      tally.count();
      tally.undo();
      result = tally.getValue();
      System.out.println("Value: " + result);
   }
}
