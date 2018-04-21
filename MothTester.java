
/**
 * MothTester
 * Tester Class for Moth
 * 
 * Ruby-Anne Locke, April 08, 2016, rubylocke@hotmail.com 
 */
public class MothTester
{
   public static void main(String[] args)
   {
      Moth gypsy = new Moth(10);
      System.out.println("  position is 10");    // to be deleted
      System.out.println("  move 0");    // to be deleted
      gypsy.moveToLight(0);
      System.out.println(gypsy.getPosition());
      System.out.println("  move 10");    // to be deleted
      gypsy.moveToLight(10);
      System.out.println(gypsy.getPosition());
      System.out.println("  move 0");    // to be deleted
      gypsy.moveToLight(0);
      System.out.println(gypsy.getPosition());
   }
}