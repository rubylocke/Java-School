/**
 * IncomeTax1913
 * Income Tax calcualtor based on 1913 rules:
 *   1 percent on the first $50,000 
 *   2 percent on the amount over $50,000 up to $75,000 
 *   3 percent on the amount over $75,000 up to $100,000 
 *   4 percent on the amount over $100,000 up to $250,000 
 *   5 percent on the amount over $250,000 up to $500,000 
 *   6 percent on the amount over $500,000 
 * 
 * Ruby-Anne Locke,Jan 31, 2016, rubylocke@hotmail.com 
 */
import java.util.Scanner; 

public class IncomeTax1913 
{ 
   public static void main(String[] args) 
   { 
      // Tax Rates
      final double TAXRATE01 = 0.01; 
      final double TAXRATE02 = 0.02; 
      final double TAXRATE03 = 0.03; 
      final double TAXRATE04 = 0.04; 
      final double TAXRATE05 = 0.05; 
      final double TAXRATE06 = 0.06; 

      // Tax Bracket low-end bracket
      final int TAXBRACKET01 =  50000; 
      final int TAXBRACKET02 =  75000; 
      final int TAXBRACKET03 = 100000; 
      final int TAXBRACKET04 = 250000; 
      final int TAXBRACKET05 = 500000;
      final int TAXBRACKET06 = 500001;   // uh uh
      
      // Tax Level
      final int TAXLEVEL00 =  0; 
      final int TAXLEVEL01 =  1; 
      final int TAXLEVEL02 =  2; 
      final int TAXLEVEL03 =  3; 
      final int TAXLEVEL04 =  4; 
      final int TAXLEVEL05 =  5; 
      final int TAXLEVEL06 =  6; 
       
      // Calculate the total tax for each bracket
      double taxBucket00 = 0;                                           //           0 
      double taxBucket01 = TAXBRACKET01 * TAXRATE01;                    //           50000 
      double taxBucket02 = (TAXBRACKET02 - TAXBRACKET01) * TAXRATE02;   //  75-50  = 25000 * 0.02 
      double taxBucket03 = (TAXBRACKET03 - TAXBRACKET02) * TAXRATE03;   // 100-75  = 25000 * 0.03 
      double taxBucket04 = (TAXBRACKET04 - TAXBRACKET03) * TAXRATE04;   // 250-100 = 125000 * 0.04 
      double taxBucket05 = (TAXBRACKET05 - TAXBRACKET04) * TAXRATE05;   // 500-250 = 250000 * 0.05 

      // variables
      int taxLevel = 0;
      int taxBracket = 0;
      double taxes = 0.0;
      
      // Get income from user
      Scanner in = new Scanner(System.in); 
      System.out.print("\nPlease enter your income "); 
      double income = in.nextDouble(); 
      
      // sets the highest taxbracket and taxlevel the income falls into 
      if (income < 0) 
      { 
          taxLevel   = TAXLEVEL00; 
      } 
      else if (income < (TAXBRACKET01 + 1))
      { 
          taxBracket = TAXBRACKET01; 
          taxLevel   = TAXLEVEL01; 
      } 
      else if (income < TAXBRACKET02 + 1) 
      { 
         taxBracket = TAXBRACKET02; 
         taxLevel   = TAXLEVEL02;
      } 
      else if (income < TAXBRACKET03 + 1)  
      { 
        taxBracket = TAXBRACKET03; 
        taxLevel   = TAXLEVEL03; 
      } 
      else if (income < TAXBRACKET04 + 1) 
      { 
        taxBracket = TAXBRACKET04; 
        taxLevel   = TAXLEVEL04; 
      } 
     else if (income < TAXBRACKET05 + 1) 
     { 
       taxBracket = TAXBRACKET05; 
       taxLevel   = TAXLEVEL05; 
     } 
     else 
     { 
       taxBracket = TAXBRACKET06; 
       taxLevel   = TAXLEVEL06; 
     } 

     //  Based on Tax Level, calculate the taxes
     switch(taxLevel) 
    {
       case 0: 
       { 
          taxes = taxBucket00; 
          break;
       } 
       case 1:   
       { 
          taxes = (income * TAXRATE01); 
          break;
       } 
      case 2: 
      { 
          taxes = ((income - TAXBRACKET01) * TAXRATE02) + taxBucket01; 
          break;
      } 
      case 3: 
      { 
          taxes = ((income - TAXBRACKET02) * TAXRATE03) + taxBucket01 + taxBucket02; 
          // comment
          System.out.printf("\nincome  " + income + " taxrate "  + TAXRATE01 + " taxBucket " + taxBucket01 + "\n"); 
          break;
      } 
      case 4: 
      { 
          taxes = ((income - TAXBRACKET03) * TAXRATE04) + 
                  taxBucket01 + taxBucket02 + taxBucket03; 
          // comment
          System.out.printf("\nincome  " + income + " taxrate "  + TAXRATE01 + " taxBucket " + taxBucket01 + "\n"); 
          break;
      } 
      case 5: 
      { 
          taxes = ((income - TAXBRACKET04) * TAXRATE05) + 
                  taxBucket01 + taxBucket02 + taxBucket03 + taxBucket04; 
              // comment
          System.out.printf("\nincome  " + income + " taxrate "  + TAXRATE01 + " taxBucket " + taxBucket01 + "\n"); 
          break;
      } 
      case 6: 
      { 
          taxes = ((income - TAXBRACKET04) * TAXRATE06) + taxBucket01 + taxBucket02 + 
                  taxBucket03 + taxBucket04 + taxBucket05; 
              // comment
          System.out.printf("\nincome  " + income + " taxrate "  + TAXRATE01 + " taxBucket " + taxBucket01 + "\n"); 
         break;
      } 
      default:   
      { 
         System.out.println("Error " + taxLevel); 
      } 
    }
    System.out.printf("The taxes on income of " + income + " is "  + taxes); 
}
}
