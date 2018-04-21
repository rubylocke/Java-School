
/**
 * AverageCalculator
 *  Caclculate the average age of four people
 * Ruby Locke, Jan 24, 2016, rubylocke@hotmail.com
 */
public class AverageCalculator
{
   public static void main(String[] args)
   {
      int age1 = 18;
      int age2 = 35;
      int age3 = 50;
      int age4 = 44;
 
      double averageAge = (age1 + age2 + age3 + age4) / 4;
      System.out.println("Display wrong value " + averageAge);
      // all figures after the equal sign are integers...giving an integer result
      // Fix equation to get the correct avarageAge
      double averageAge1 = (age1 + age2 + age3 + age4) / 4.0;
      System.out.println("Correct wrong value " + averageAge1);
    }
}
