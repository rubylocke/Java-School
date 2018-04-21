
/**
 * Expressions.
 * Documentations describing expressions
 * 
 *Ruby Locke, Jan 24, 2016, rubylocke@hotmail.com
 */
public class Expressions
{
   public static void main(String[] args)
   {
      int a = 3;
      int b = 4;
      int c = 5;
      int d = 17;
      System.out.println((a + b)/ c);  
      // 3 and 4 are added with sum 7
      // 7 is divided by 5 with quotient 1
      System.out.println(a + b / c);
      // 4 is divided by 5 with quotient 0
      // 3 is added to 0 with sum 3
      System.out.println(a++);                //  display 'a' then increment "a" by 1
      System.out.println(a--);                //  display 'a' then decrement "a" by 1
      System.out.println(a + 1);              //  display the sum of 'a' and 1 = 4
      System.out.println(d % c);              //  display the remainder of 17/5
      System.out.println(d / c);              //  display int value of 17/5
      System.out.println(d % b);              //  display the remainder of 17/4 = 1
      System.out.println(d / b);              //  display the int value of 17/4 = 4
      System.out.println(d + a / d + b);      //  display the value of (17 + 4) +
                                              //   integer resultant of the divsion (0)
      System.out.println((d + a) / (d + b));  //  display the integer value of 20/21  (0)
                                              //  ->   17 + 3  then ->  17 + 4                                              //   integer resultant of the divsion (0)
      System.out.println(Math.sqrt(b));       //  display 'double' square of 4 =>  2.0
      System.out.println(Math.pow(a, b));     //  display 'double ' 3 to the power of 4 ==> 81.0
      System.out.println(Math.abs(-a));       //  display the absolute value of -3 ==> 3
      System.out.println(Math.max(a, b));     //  display the value which is the highest value of 
                                              //  3 and 4 ==> 4
   }
}
