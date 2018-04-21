/**
/* HelloWorld
 * . open a file
 * . store message
 * . close the file
 * . open file again
 * . Read file
 * . Display contents
 * 
 * Ruby-Anne Locke, Feb 28, 2016, rubylocke@hotmail.com
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HelloWorld
{
   public static void main(String[] args) throws FileNotFoundException
   {  
      // prompt for output file name
      Scanner console = new Scanner(System.in);
      System.out.print("Output file name? ");
      String outputFileName = console.next();
      
      // construct the PrintWriter object
      PrintWriter fileOut = new PrintWriter(outputFileName);
      
      String dataInput = "Hello, World!";
      
      fileOut.printf(dataInput);
      
      fileOut.close();
     
      System.out.println("\n  File Close\n"); 
      
      // Construct the inputFile
      File inputFile = new File("C:\\Users\\rubyl\\Documents\\Bluejay\\Ch07p1\\ruby.txt");
      Scanner in = new Scanner(inputFile);
      
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         System.out.println(line);
      }
      in.close();
    }
}