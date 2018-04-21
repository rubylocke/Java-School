/**
 * Temparature
 *  Asks for Tempature Type letter C for Celsius or F for Fahrenheit.
 *  Asks for Temperature.
 *  Print whether water is liquid, solid, or gaseous at the given temperature at sea level. 
 * Ruby-Anne Locke, Jan 30, 2016, rubylocke@hotmail.com
 */
import java.util.Scanner; 
public class Temperature 
{ 
   public static void main(String[] args) 
   { 
       boolean programContinue = true;
       Scanner in = new Scanner(System.in); 
       System.out.print("Enter C for Celsius or F for Fahrenheit  "); 
       char temp = in.next().charAt(0); 
       if (temp == 'c'  || temp == 'C')
       {   
          ;
       }
       else if (temp == 'f'  || temp == 'F')
       {   
          ;
       }
       else
       {
           System.out.printf("Available options are C, c, F, and f\n"); 
           programContinue = false;
       }
       if (programContinue)
       {
           System.out.print("What is the temperature in degress:  "); 
           double degrees = in.nextDouble(); 
           if (temp == 'c'  || temp == 'C') 
           { 
              if (degrees < 0) 
              { 
                 System.out.println("At " + "C " + "water is frozen"); 
              } 
              else if (degrees < 101) 
              { 
                 System.out.println("At " +  "C " + "water is liquid"); 
              } 
              else  
              { 
                 System.out.println("At " +  "C " + "water is gaseous"); 
              } 
           } 
           else if (temp == 'F' || temp == 'f') 
           { 
              if (degrees < +32) 
              { 
                 System.out.println("At " +  "F " + "water is frozen"); 
              } 
              else if (degrees < 212) 
              { 
                System.out.println("At " +  "F " + "water is liquid"); 
              } 
              else  
              { 
                System.out.println("At " +  "F " + "water is gaseous"); 
              } 
           } 
           else 
           { 
              System.out.println("Temperature has to be \"F\" or \"C\""); 
           } 
       }
   }
} 