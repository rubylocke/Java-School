
/**
 * MathCalc
 *  Input two integers
 *  Perform the following mathematical functions on the values
 *    and display the result:
 *     - The sum
 *     - The difference
 *     - The product
 *     - The distance (absolute value of difference)
 *     - The maximun (larger of the two)
 *     - The minimum (smaller of the two)
 * Ruby Locke. Jan 24, 2016, rubylocke@hotmail.com
 */
import java.util.Scanner;

public class MathCalc
{
    public static void main(String[] args)
    {
        // initialise instance variables
        final double COUNT = 2;
        int sum1 = 0;
        int diff1 = 0;
        
        Scanner in = new Scanner(System.in);
       
        // Read in the first variable
        System.out.print("Please enter the first integer value :  ");
        int operand1 = in.nextInt();
        
        // Read in the second variable
        System.out.print("Please enter the second integer value : ");
        int operand2 = in.nextInt();  
        
        // line before output
        System.out.println();
        // Calculations
        sum1 = operand1 + operand2;
        diff1 = operand1 - operand2;

        
        // Display the sum
        System.out.printf("The sum of                 " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",sum1);
        System.out.println();
        
        // Display the difference
        System.out.printf("The difference of          " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",diff1);
        System.out.println();
        
        // Display the product
        System.out.printf("The product                " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",(operand1 * operand2));
        System.out.println();
                
        // Display the distance (absolute value of difference)
        System.out.printf("The absolute difference of " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",Math.abs(diff1));
        System.out.println();
        
        // Display the maximun (larger of the two)
        System.out.printf("The Maximun of the values  " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",Math.max(operand1, operand2));
        System.out.println();
        
        // Display the minimun  (smaller of the two)
        System.out.printf("The Minimun of the values  " + operand1 + " and " + operand2 + " is ");
        System.out.printf("%5d",Math.min(operand1, operand2));
    }
}
