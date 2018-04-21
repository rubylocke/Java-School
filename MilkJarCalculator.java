
/**
 * MilkJarCalculator
 * Storage of Milk in Jars calculation
 * Ruby Locke, Jan 24, 2016, rubylocke@hotmail.com
 */
public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 5.5;              // gallons
      double jarCapacity = 0.75;      // gallons
      
      // calclat the storage of full jars
      int completelyFilledJars = (int) (milk / jarCapacity);
      
      // dislpay results
      System.out.println(completelyFilledJars);
   }
}
