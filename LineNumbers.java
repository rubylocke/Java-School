/**
 * LineNumbers
 * . read in a file
 * . write out each line contents
 * . write out each line to new file 
 *   with delimiters and line numbers
 * . close files
 * Ruby-Anne Locke, Feb 28, 2016, rubylocke@hotmail.com
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumbers
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      // record variable
      int number = 0;
      
       // prompt for input and output file names
      Scanner console = new Scanner(System.in);
      System.out.print("Input file name? ");
      String inputFileName = console.next();
      System.out.print("Output file name? ");
      String outputFileName = console.next();
      
      // construct the Scanner and PrintWriter objects for reading and writing
      File inputFile = new File("C:\\Users\\rubyl\\Documents\\Bluejay\\Ch07p1\\LineNumbers.txt");
      Scanner in = new Scanner(inputFile);
      PrintWriter fileOut = new PrintWriter(outputFileName);
      
      // read and write the output
      while (in.hasNextLine())
      {
         String value = in.nextLine();
         number = number + 1;
         fileOut.printf("/* " + number + " */ " + value + "\r\n");
        }
      
      in.close();
      fileOut.close();
     
    }
}